// package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static int N;
	static int[] sorted;
	static int[] list;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		N = Integer.parseInt(bfr.readLine());
		sorted = new int[N];
		
		list = new int[N];
		
		for(int i = 0; i < N; i++) 
			list[i] = Integer.parseInt(bfr.readLine());

		merge_sort(0, N-1);
		
		for(int n : list)
			sb.append(n + "\n");
		
		System.out.println(sb);
		
	}
	
	public static void merge(int left, int mid, int right) { // 분할된 2개의 배열을 합병하는 메소드
		int i, l, m;
		
		i = left; l = left; m = mid+1;
		
		while(l <=mid && m <=right) {	// 왼쪽 배열과 오른쪽 배열이 둘 다 병합되지 못한 원소가 남아있다면
			if(list[l] <= list[m]) 		// 값을 비교하여 더 작은 원소를 sorted배열에 넣는다.
				sorted[i++] = list[l++];
			else 
				sorted[i++] = list[m++];
		}
		
		// 합병이 끝나도 남아있는 원소가 있다면 일괄로 모두 sorted배열에 복사한다.
		if(l > mid) {						// 왼쪽 배열이 모두 정리된 경우
			for(int k = m; k <= right; k++) // 오른쪽 배열에 남아있는 원소가 있다면 모두 sorted배열에 복사
				sorted[i++] = list[k];
		}
		else {								// 왼쪽 배열이 남아있는 경우
			for(int k = l; k <= mid; k++)	// 왼쪽 배열의 남아있는 원소를 모두 sorted배열에 복사
				sorted[i++] = list[k];
		}
		
		for(int h = left; h <= right; h++) { // sorted 배열 값을 list에 다시 복사한다.
			list[h] = sorted[h];
		}
	}
	
	public static void merge_sort(int left, int right) { // 배열을 분할하는 메소드. left: (분할할)배열의 시작, right: 배열의 끝
		int mid;
		if(left < right) {				// 배열의 원소가 2개 이상이면 분할
			mid = (left + right) / 2;
			merge_sort(left, mid);		// 왼쪽 배열을 분할한다
			merge_sort(mid+1, right);	// 오른쪽 배열을 분할한다
			merge(left, mid, right);	// 배열 2개를 병합한다
		}
	}
}