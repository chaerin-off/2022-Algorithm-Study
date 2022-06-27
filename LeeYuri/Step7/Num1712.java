// package Step7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		
		if(B>=C) {						// 만약 가변비용이 판매비용보다 크거나 같다면
			System.out.println("-1");	// 손익분기점이 없기 때문에 -1 출력
			return;						// 프로그램 종료
		}
		System.out.println(A/(C-B)+1);	// 손익분기점을 구하는 식을 사용하여 계산
	}
}
