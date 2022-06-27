// package Step7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int line = 1;		// 몇번째 줄인지 확인할 변수 (여기서 줄은 배열의 행을 뜻하는 것이 아니라 지그재그로 표현하는 줄을 뜻한다)
		int numer = 1; 		// 분자
		int denomi = 1; 	// 분모
		boolean even = true;
		
		for(line = 1;n>line;line++) {
			n -= line;		// 입력받은 값이 줄보다 크다면 1부터 빼가면서 몇 번째 줄인지 알아낸다
		}
		
		if(line%2 == 0) 	// 짝수번째 줄이면
			denomi = line;	
		else {				// 홀수번째 줄이면 
			numer = line;
			even = false;
		}
		
		for(int i = 1;i<n;i++) {
			if(even) {
				denomi--;
				numer++;
			}
			else {
				denomi++;
				numer--;
			}
		}
		System.out.print(numer + "/" + denomi);
	}
}