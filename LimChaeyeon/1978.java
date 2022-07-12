import java.util.Scanner;

public class Main {
	static int count = 0;
	
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
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		int num;
		
		for(int i=0; i<numCount; i++) {
			num = sc.nextInt();
			if(isPrime(num) == true)
				count++;
		}
		
		System.out.println(count);
	}

}
