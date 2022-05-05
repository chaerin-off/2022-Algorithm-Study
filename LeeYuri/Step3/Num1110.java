//package step3;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt(), n, ten, one, temp = 0, count = 0;
		n = first;
		
		while(first != temp) {
			ten = n / 10;
			one = n % 10;
			temp = ten + one;
			n = (one * 10) + (temp % 10);
			temp = n;
			count++;
		}		
		System.out.println(count);
	}
}