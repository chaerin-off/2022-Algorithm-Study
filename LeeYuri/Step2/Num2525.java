//package Step2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), M = sc.nextInt(), T = sc.nextInt();
		
		M += T;
		while(M >= 60) {
			M -= 60;
			if(H == 23) H = 0;
			else H++;
		}
		System.out.println(H + " " + M);
	}
}