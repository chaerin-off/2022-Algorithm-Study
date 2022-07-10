// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T, N, A, B;		// T: 반복횟수, N: 짝수, A: 첫 번째 소수, B: 두 번째 소수
		boolean list[];		// 소수를 판별할 배열 
		
		T = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<T;i++) {	
			N = Integer.parseInt(bf.readLine());
			list = new boolean[N+1];
			
			// 2부터 N까지 소수를 판별하여 배열에 표시한다.
			for(int j=2;j<=N;j++) {
				if(list[j]) continue;
				
				for(int l=j+j;l<=N;l+=j) list[l] = true;
			}
			
			A = B = N/2;	// N을 2로 나눈 값을 A와 B에 넣는다
			
			while(true) {	
				if(list[A]) { // 만약 A가 소수라면
					A--; B++; // A는 -- B는 ++
				}
				else if(list[B]) { // A가 소수인데 B가 소수가 아닐 경우
					A--; B++; // A는 -- B는 ++ 
				}
				else break;	  // A와 B가 모두 소수라면 while문 종료
			}
			System.out.println(A + " " + B);
		}
		bf.close();
	}
}