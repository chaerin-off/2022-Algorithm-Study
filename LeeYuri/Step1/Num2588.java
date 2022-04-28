//package step1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		int one, ten, hundred, result;
		result = a*b;
		hundred = b/100;
		b = b%100;
		ten = b/10;
		b = b%10;
		one = b;
		System.out.print((a*one) + "\n" + (a*ten) + "\n" + (a*hundred) + "\n" + (result));
	}
}
