package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 카운팅 정렬을 사용하여 오름차순으로 정렬하기

public class Num10989 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bfr.readLine());
		int[] list = new int[N];	// 정렬할 요소들을 저장할 배열
		int[] sort = new int[N];	// 정렬된 요소들을 저장할 배열
		int max = 0;				// 최댓값
		StringBuilder sb = new StringBuilder();
		
		// 요소를 입력받아 list에 저장하면서 최댓값을 찾아 max에 저장한다.
		for(int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(bfr.readLine());
			if(list[i] > max) max = list[i];
		}
		
		int[] count = new int[max + 1];	// 최댓값 + 1 크기의 카운팅 배열을 만든다. (+1은 배열의 0번째를 생각하여 해준다.)
		
		for(int n : list)			// list에 있는 숫자들이 몇 개 있는지 카운팅배열에 저장하도록 한다.
			count[n]++;
		
		for(int i = 1; i < max + 1; i++) 
			count[i] += count[i-1];	// 카운팅 배열에 있는 값들을 누적 합으로 바꿔 정렬될 숫자가 몇 번째인지 알 수 있도록 한다.

		/* list[i]번째에 있는 숫자가 몇 번째인지 카운팅 배열에서 확인하여 -1하고, 
		이 값을 sort배열의 인덱스로 하여 그 위치에 list[i]번째에 있던 숫자를 저장한다. */
		// 카운팅 배열에서 list[i]번째의 값을 -1해준다.
		for(int i = 0; i < N; i++) {
			sort[count[list[i]] - 1] = list[i];	
			count[list[i]]--;
		}
			
		for(int n : sort)
			sb.append(n + "\n");
		
		System.out.println(sb);	// 정렬된 배열 출력
	}
}