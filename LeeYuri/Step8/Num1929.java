// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
	
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();	// 문자열을 추가할 수 있음
		
		boolean[] list = new boolean[N+1];		// 소수를 표시할 배열. N+1의 크기로 만들어야 한다.
		list[1] = true;							// list[1]은 true로 변경하여 소수가 아님을 표시한다.
		
		for(int p=2;p<=N;p++) {					// 2부터 N보다 작거나 같을 때까지 모든 수를 소수인지 아닌지 검사한다.
			if(list[p]) continue;				// 이미 소수가 아닌 것으로 배열에 표시해두었다면 해당 반복 순서를 건너뛴다.
			
			if(p>=M) sb.append(p).append("\n");	// 배열에서 false이면서 M보다 크다면 StringBuilder에 줄바꿈 문자와 함께 추가한다.
			
			for(int i=p+p;i<=N;i+=p) {			// ex) p = 2 라면 4부터 2의 배수는 모두 true로 변경한다.
				list[i] = true;
			}
		}
		
		System.out.println(sb);
		
		bf.close();
	}
}