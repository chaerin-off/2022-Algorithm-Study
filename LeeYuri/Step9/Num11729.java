// package Step9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	static BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int count = hanoi_count(N);	// 옮긴 횟수가 몇번인지 계산하는 함수를 호출하여 변수에 받는다.
		
		bfw.append(count + "\n");
		hanoi(N, 1, 2, 3);
		
		bfw.close();
	}

	public static int hanoi_count(int N) {	// 옮긴 횟수가 몇번인지 계산하는 재귀함수
		if(N == 1) return 1;
		return 2 * hanoi_count(N-1) + 1;
	}
	
	public static void hanoi(int N, int A, int B, int C) throws IOException {	// A, B, C는 3개의 장대를 의미하며 처음 값은 1, 2, 3
		if(N == 1) bfw.append(A + " " + C + "\n");	// 만약 원판(N)이 1개라면 A에서 C로 옮긴다.
		else { // 원판이 한 개가 아니라면
			hanoi(N-1, A, C, B);			/* 재귀 호출함으로서 원판이 짝수개면 if(N == 1) 구문에서 1->2번 장대로 옮겨지고, 
												홀수개면 1->3번 장대로 옮겨진다.
												1번에서 다른 장대로 원판이 이동하는 경우를 이 호출을 통해 알아낼 수 있다. */
			bfw.append(A + " " + C + "\n");	
			hanoi(N-1, B, A, C);			// 2번 또는 3번에서 다른 장대로 이동하는 경우를 이 호출을 통해 알아낼 수 있다.
		}
	}
}