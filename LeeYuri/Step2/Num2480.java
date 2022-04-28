//package Step2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), price;
		
		if(a == b && b == c) price = 10000 + a*1000;
		else if(a==b || a==c) price = 1000 + a*100;
		else if(b==c) price = 1000 + b*100;
		else {
			if(a>b && a>c) price = a*100;
			else if(b>c) price = b*100;
			else price = c*100;
		}
		System.out.println(price);
	}
}