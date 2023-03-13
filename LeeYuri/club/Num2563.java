package GDSC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paper[][] = new int[100][100];	// 도화지와 같은 크기의 배열을 만든다.
		
		int N = sc.nextInt();				// 색종이의 개수를 N에 저장한다.
		int result = 0;
		
		for(int i = 0; i < N; i++) {		// N만큼 반복
			int x = sc.nextInt();			// 색종이를 붙인 위치를 x, y변수에 각각 담는다.
			int y = sc.nextInt();
			
			for(int j = x; j < x + 10; j++) { // 색종이의 크기가 10이니 10x10만큼 도화지 배열에 1로 표시한다.
				for(int k = y; k < y + 10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		for(int j = 0; j < 100; j++) {
			for(int k = 0; k < 100; k++) {
				if (paper[j][k] == 1) result++;	// 배열에서 1로 표시된 만큼 result값을 증가시킨다.
			}
		}
		
		System.out.println(result);
		
	}
}
