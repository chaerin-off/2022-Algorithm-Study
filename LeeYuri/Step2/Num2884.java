//package Step2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), M = sc.nextInt();
		
		if(M>=45) M -= 45;
		else {
			M = M + 60 - 45;
			if(H == 0) H = 23;
			else H--;
		}
		System.out.println(H + " " + M);
	}
}