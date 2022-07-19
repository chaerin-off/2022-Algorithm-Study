// package Step10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();		// 카드의 개수
		int M = sc.nextInt();		// 카드의 합이 가장 가까워야 하는 수
		int card[] = new int[N];	// 카드의 값을 저장할 배열
		int sum = 0, max = 0;		// sum: 카드 3장을 더하여 저장할 변수, max: 카드 3장의 합 중 가장 큰 수를 저장할 변수
		
		for(int i = 0; i < N; i++) 
			card[i] = sc.nextInt();
		
		// 겹치지 않도록 3개의 수를 더한다.
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					sum = card[i] + card[j] + card[k];	// 3장의 카드를 더한다.
					if(sum <= M && sum > max) max = sum;// 만약 더한 값이 max보다 크다면 max값 변경
				}
			}
		}
		System.out.println(max);
	}
}