// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 문자열을 읽어와 전체를 뒤집어 s에 저장
		String s = new StringBuffer(bf.readLine()).reverse().toString();
		String[] Num = s.split(" ");	// 공백으로 구분하여 문자열 배열에 저장
		
		// 문자열 배열에 있는 값을 각각 정수로 변환하여 변수에 저장
		int A = Integer.parseInt(Num[0]);
		int B = Integer.parseInt(Num[1]);
		
		// 변수 크기를 비교하여 큰 값을 출력
		if(A>B) System.out.print(A);	
		else System.out.print(B);
		bf.close();
	}
}