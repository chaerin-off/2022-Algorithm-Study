import java.util.Scanner;

public class Main {
	// 유클리드 호제법
	static int gcd(int a, int b) {
		if(a%b == 0)
			return b;
		else
			return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		int GCD;
		int i = 2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		GCD = gcd(num1, num2);
		
		System.out.println(GCD);
		System.out.println(num1*num2 / GCD);
	}

}
