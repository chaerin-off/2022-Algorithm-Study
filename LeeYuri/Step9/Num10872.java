// package Step9;

import java.util.Scanner;

public class Main {
	int N, factorial;
	
	public Main() {		// 생성자
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();	// 주어진 N을 받는다.
		factorial = 1;		// 팩토리얼 값을 곱해줄 전역변수를 1로 초기화한다.
		
		rotation(N);		// 재귀함수 호출 (N이 인수로 주어진다)
		
		System.out.println(factorial);
	}
	
	public static void main(String[] args) {
		Main start = new Main();	// 객체 생성
	}
	
	public void rotation(int n) {	// N을 인수로 받는 재귀함수
		if(n > 1) {			// N이 1보다 큰 경우에만
			factorial *= n;	// 팩토리얼 변수에 n을 곱한다.
			n--;			// n을 --해준다.
			rotation(n);	// 자기 자신을 호출한다.
		}
	}
}