// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] list = new int[26];
		for(int i = 0;i<26;i++) 
			list[i] = -1;
		
		String S = bf.readLine();
		
		for(int i = 0;i<S.length();i++) {
			if(list[S.charAt(i) - 'a'] == -1) // 문자를 하나씩 읽어와서 'a'만큼 빼면 알파벳 순서대로 아스키 코드값이 0부터 시작.
				list[S.charAt(i) - 'a'] = i;
		}
		
		for(int n : list)
			System.out.print(n + " ");
		
		bf.close();
	}
}