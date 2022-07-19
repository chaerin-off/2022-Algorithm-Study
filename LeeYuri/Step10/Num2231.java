// package Step10;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;			// 분해합을 저장할 변수
		
		for(int i = 1; i < N; i++) {
			sum = 0;				// 분해합은 반복 시 항상 0으로 초기화한다
			int tmp = i;			// i 를 가지고 분해합을 만들어 N과 비교할 것이기 때문에 임시로 만든 변수 tmp에 i값 저장
			while(tmp / 10 != 0) {	// 만약 tmp가 한 자리 수가 아니라면
				sum += tmp % 10;	// 10으로 나눈 나머지 값을 sum에 더한다
				tmp /= 10;			// 10으로 나눈 몫을 tmp에 저장한다
			}
			sum += tmp;				// 남은 한 자리수를 sum에 더한다
			sum += i;
			if(sum == N) {			// 만약 구한 sum값이 N과 같다면
				System.out.println(i);	// i가 가장 작은 생성자 이므로 i를 출력한다
				return;					// 프로그램을 종료한다
			}
		}
		System.out.println("0");	// 생성자가 없다면 for문을 빠져나오므로 여기서 0을 출력한다
	}
}