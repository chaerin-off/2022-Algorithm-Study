// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		int count, max;		// count: 소수의 개수 max: 2*n
		boolean[] list;		// 소수인지 판별하기 위한 배열
		
		while(n != 0) {
			max = 2*n;					// n에서 2*n 사이이기 때문에 max값을 2*n으로 저장
			list = new boolean[max+1];	// 배열의 크기를 max+1로 설정한다
			count = 0;
			
			// 에라토스테네스의 체를 이용하여 소수를 구한다.
			for(int i=2;i<=max;i++) {	// 1은 소수에 포함되지 않기 때문에 2부터 시작
				if(list[i]) continue;	// 배열이 이미 true라면 이번 반복 순서를 건너뛴다
				
				if(i>n) count++;		// 배열이 false이면서 i가 n보다 크다면 count를 ++한다
				
				for(int j=i+i;j<=max;j+=i) {
					list[j] = true;		// 소수의 배수는 모두 true로 변경한다.
				}
			}
			
			System.out.println(count);
			n = Integer.parseInt(bf.readLine());
		}
	}
}