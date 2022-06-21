package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 문제
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

public class Num1157 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String s = bf.readLine();					// 문자열을 입력받음
		s = s.toUpperCase();						// 문자열을 모두 대문자로 변경

		int[] list = new int[26];					// 알파벳이 몇 번 사용되었는지 저장할 정수형 배열
		
		for(int i=0;i<s.length();i++) 
			list[s.charAt(i) - 'A']++;				// 문자열에서 한 글자씩 가져와 'A'만큼 뺀 값을 인덱스로 사용하여 ++한다.

		int max = -1, max2 = -1, result = 0;		// 가장 많이 사용된 알파벳이 여러 개 존재하는 경우를 알기위해 max변수를 2개 둔다.
		
		for(int i=0;i<list.length;i++) {
			if(list[i]>max) {						// max보다 list[i]에 있는 값이 크다면 
				max = list[i];						// max값 변경
				result = i;
			}
			else if(list[i] > max2) max2 = list[i];	// list[i]에 있는 값 max보다 크지 않지만 max2보다 크다면 max2값 변경
		}
		
		if(max == max2) System.out.print("?");		// 만약 max와 max2값이 같다면 ?출력
		else System.out.print((char)(result + 'A') + " ");
		
		bf.close();
	}
}