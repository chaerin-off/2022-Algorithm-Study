//package Step4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		for(int i=0;i<c;i++) {
			int n = sc.nextInt();
			int sum = 0, num = 0;
			int[] list = new int[n];
			for(int j=0;j<n;j++) {
				list[j] = sc.nextInt();
				sum += list[j];
			}
			int average = sum/n;
			for(int a:list)
				if(a>average) num++;
			
			System.out.println(String.format("%.3f",(float)num/n*100)+"%");
		}
	}
}