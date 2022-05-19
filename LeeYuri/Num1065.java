//package Step5;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	boolean Hansu(int x) {
		if(x==1000) return false;
		
		int hund = x/100;
		int ten = (x/10)%10;
		int one = x%10;
				
		if((hund-ten) == (ten-one)) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Main c = new Main();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), count = 0;
		
		if(x<100) 
			System.out.println(x);
		else {
			for(int i =100;i<=x;i++)
				if(c.Hansu(i)) count++;
			System.out.println(count+99);
		}	
	}
}