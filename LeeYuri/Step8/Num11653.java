// package Step8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = sc.nextInt(), prime = 2;

		if(N == 1) return;			// 만약 입력받은 값이 1이면 프로그램 종료
		
		while(prime<=N) {			// prime값이 N보다 작거나 같다면 반복
			if(N%prime == 0) {		// N을 prime으로 나눈 나머지가 0이면
				N /= prime;			// N은 prime으로 나눈 몫으로 변경
				list.add(prime);	// ArrayList(동적 배열)에 prime값 추가
			}
			else prime++;			// 나머지가 0이 아니면 prime값을 증가시킴
		}
		Collections.sort(list);		// ArrayList를 오름차순으로 정렬
		
		for(int n : list)
			System.out.println(n);
	}
}