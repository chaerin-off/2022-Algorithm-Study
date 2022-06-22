package Step6;

/*
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 
 * 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt(), count = 0;
		boolean check;						// 문자가 연속으로 나타난 경우인지 아닌지 확인
		
		for(int i=0;i<n;i++) {
			String s = sc.next();			
			int[] alphabet = new int[26];			// 어떤 문자가 사용되었었는지 저장할 배열
			check = true;					// check = true이면 문자가 연속해서 나타나는 경우만을 의미
			
			for(int j=0;j<s.length();j++) {
				char a = s.charAt(j); 		
				if(alphabet[a - 'a'] > 0) {		// 만약 배열에 이미 1 이상의 값이 있다면
					if(a != s.charAt(j-1)) {	// 이전의 알파벳과 비교해서 다르다면
						check = false;		// 연속해서 나온 것이 아니므로 check을 false로 변경
						break;			// 내부 for문을 중단시킴
					}
				} else alphabet[a - 'a']++;
			}
			if(check) count++;				// check가 true일때만 count++
		}
		System.out.print(count);
	}
}
