// package Step9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(Fibonacci(n));
	}
	
	public static int Fibonacci(int n) {
		if(n < 2) return n;	// 0 또는 1이면 그대로 반환
		return Fibonacci(n-1) + Fibonacci(n-2);	// 2 이상이면 피보나치 수열 공식에 맞춰 자기 자신을 호출한다.
	}
}