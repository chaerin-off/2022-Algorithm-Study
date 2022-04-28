import java.util.*;

public class Main {
	public static void main(String[] args) {
		int n, T;
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			n = sc.nextInt();
			String s = Integer.toBinaryString(n); //이진수 변환
			
			for (int j = s.length() - 1; j >= 0; j--) { //s.lenth()-1: 문자열의 크기가 4일때 마지막 문자의 인덱스는 3
				if (s.charAt(j) == '1') { //String s를 char(한 글자)로 변환하여 하나씩 검사
					System.out.print(s.length()-j+1 + " "); //j만 출력: 3 1 0 -> 4- => 1 3 4 -> -1 => 0 2 3
				}
      }
			System.out.println();
		}
	}
}
