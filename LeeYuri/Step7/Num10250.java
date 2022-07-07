//package Step7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int H = sc.nextInt();	// 호텔의 층 수
			int W = sc.nextInt();	// 각 층의 방 수
			int N = sc.nextInt();	// N 번째 손님
			
			/*
			 *  호텔의 층 수를 N으로 나눈 몫은 호수가 된다.
			 *  호텔의 층 수를 N으로 나눈 나머지는 층수가 된다.
			 */
			
			if(N%H == 0) System.out.println((H*100)+(N/H));
			else System.out.println(((N % H) * 100) + ((N / H) + 1));			
		}	
	}
}