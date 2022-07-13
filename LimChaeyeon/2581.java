import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int sum = 0;
	
	static boolean isPrime(int num) {
		int i=2;
		
		if(num==1)
			return false;
		else {
			while(i < num) {
				if(num%i == 0)
					return false;
				else
					i++;
			}
		}
		sum += num;
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int i = start, min = end;
		
		while(i<=end) {
			if(isPrime(i) == true) {
				if(i<min)
					min = i;
			}
			
			i++;
		}
		if(sum == 0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
