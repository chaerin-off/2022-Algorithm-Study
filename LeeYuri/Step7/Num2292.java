// package Step7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int count = 1;
		int block = 1;
		
		while(block < N) {
			block += 6*count;
			count++;
		}
		System.out.print(count);
	}
}