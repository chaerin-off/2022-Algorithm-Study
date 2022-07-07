// package Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine()); // BufferedReader로 한 줄을 읽어와 문자열을 분리하기 위해 사용
		
		long A = Integer.parseInt(st.nextToken());
		long B = Integer.parseInt(st.nextToken());
		long V = Integer.parseInt(st.nextToken());
		
		if(V == A) {	// 만약 V와 A가 같다면 달팽이는 첫날 낮만에 올라갈 수 있음
			System.out.println("1");
			return;
		}
		
		/*
		 *  첫날 낮에 올라갈 수 없다면?
		 *  A-B가 하루동안 올라갈 수 있는 길이이다
		 *  낮에는 올라가기만 하므로 며칠이 걸리든 낮에 다 올라갈 수 있기 때문에 
		 *  V에 -A를 해준 후 이를 A-B로 나눈다
		 */
		
		
		long day = (V-A)/(A-B);		
		
		// 만약 day가 정확히 나누어 떨어지면 +1, 나머지가 1 이상 남으면 +2한다
		if((V-A)%(A-B) >= 1) System.out.print(day+2);
		else System.out.print(day+1);
		
		bf.close();
	}
}