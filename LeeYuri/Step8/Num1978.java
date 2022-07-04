// package Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(bf.readLine());	// 테스트 개수를 받음
		int tmp, count = 0;							// tmp: 소수인지 판별할 수를 잠시 저장할 변수 | count: 소수의 개수
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		for(int i=0;i<T;i++) {
			tmp = Integer.parseInt(st.nextToken());	// 숫자를 하나 가져와 tmp에 저장
			
			if(tmp > 1) {							// 1은 소수가 아니기에 1보다 큰 경우만 소수 판별
				for(int j=2;j<tmp;j++) {			
					if(tmp%j == 0) {				// 2부터 tmp보다 작은 값으로 tmp를 나눴을 때 나머지가 0이라면 소수가 아니다.
						count--;					// count값에 변화를 주지 않기 위해 --
						break;						// 내부 for문을 중지시킴
					}
				}
				count++;
			}
		}
		System.out.println(count);
		
		bf.close();
	}
}