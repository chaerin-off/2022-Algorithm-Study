package Step6;

import java.util.ArrayList;
import java.util.Scanner;

public class Num10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		int[] list = new int[26];
		for(int i = 0;i<26;i++) 
			list[i] = -1;
		int j = 0;
		
		for(int i = 0;i<S.length();i++) {
			if(list[S.charAt(j) - 'a'] == -1) 
				list[S.charAt(j) - 'a'] = i;
			j++;
		}
		
		for(int n : list)
			System.out.print(n + " ");
	}
}