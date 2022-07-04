// package Step8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), N = sc.nextInt();
		int min = N+1, sum = 0, count = 0;
		boolean check;
		
		for(int i=M;i<=N;i++) {
			check = true;
			if(i > 1) {							// 1은 소수가 아니기에 1보다 큰 경우만 소수 판별
				for(int j=2;j<i;j++)		
					if(i%j == 0) check = false;	// 2부터 i-1까지의 수로 나누어떨어지면 check을 false로 설정
				if(check) {						// check이 true인 경우에만
					count++;					
					sum += i;					// 소수를 sum과 더함
					if(i<min) min = i;			// min보다 작으면 min값을 변경
				}
			}
		}
		
		if(count == 0) System.out.print("-1");	// 만약 count가 0이면 소수가 하나도 없는 것이므로 -1출력
		else System.out.print(sum + "\n" + min);
	}
}