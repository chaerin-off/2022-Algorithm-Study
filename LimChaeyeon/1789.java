import java.util.Scanner;

public class Main {
	public static long s;
	
	static int count(long sum) {
		int n = 1;
		
		while((sum-=n) > n++) {
			System.out.println(sum);
			System.out.println(n);
			System.out.println();
		};
		
		/*do {
			if((thisSum+n > sum))
				break;
			else {
				thisSum += n;
				c++; n++;
			}
		}while(thisSum < sum);*/
		
		return n-1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextLong();
		
		System.out.println(count(s));
	}

}
