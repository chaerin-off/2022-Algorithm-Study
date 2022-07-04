// package Step7;

/*
 * 설탕 배달
 * 5kg, 3kg 의 설탕 봉지를 가지고 정확히 Nkg의 설탕을 배달해야한다.
 * 최대한 적은 수의 봉지를 가지고 배달하도록 하면 봉지 몇 개를 가져가면 되는지 구하여 출력해보자.
 */

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int tmp = N/5;tmp>=0;tmp--) {	// tmp 는 5kg 봉지를 가져가는 개수 만약 N과 딱 맞게 나누어떨어지지 않는다면 tmp를 1씩 줄인다.
			if((N-tmp*5)%3 == 0) {			// 5kg, 3kg봉지로 Nkg이 나누어떨어진다면
				int tmp2 = (N-tmp*5)/3;		// 3kg 봉지 개수를 구하여 임시 변수에 저장
				System.out.println(tmp + tmp2);	// 최종 봉지 개수를 출력
				return;						// 프로그램 종료
			}	
		}
		System.out.println("-1");			// 만약 최종 봉지 개수를 구하지 못했다면 -1 출력
	}
}