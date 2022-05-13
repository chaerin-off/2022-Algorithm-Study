// package Step4;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0;i<n;i++) 
			list.add(sc.nextInt());
		
		int min = 1000001, max = -1000001, tmp;
		
		for(int i = 0;i<n;i++) {
			tmp = list.get(i);
			if(tmp<min) min = tmp;
			if(tmp>max) max = tmp;
		}
		
		System.out.print(min+" "+max);
	}
}