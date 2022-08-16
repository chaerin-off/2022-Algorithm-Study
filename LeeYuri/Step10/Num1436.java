// package Step10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1, i = 666;	// 666보다 작은 수는 셀 필요 없으므로 666부터 시작한다.
		
		while(count < N) {		// count가 N보다 작다면 반복
			i++;				// i에 1씩 추가하면서
			if((i+"").contains("666")) count++;	// 만약 666을 포함한다면 count를 1 증가시킨다.
		}
		
		System.out.println(i);	// count가 N과 같아지면 반복문을 빠져나와 i를 출력한다.
	}
}