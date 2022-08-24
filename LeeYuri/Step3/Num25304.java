package step3;

import java.util.Scanner;

public class Num25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();	// 영수증 총 금액
		int N = sc.nextInt();	// 영수증 구매한 물건의 종류의 수
		int a, b, sum = 0;
		
		for(int i = 0; i < N; i++) {
			a = sc.nextInt();	// 각 물건의 가격
			b = sc.nextInt();	// 각 물건의 개수
			sum += a * b;
		}
		
		if( sum == X) System.out.println("Yes");
		else System.out.println("No");
	}
}