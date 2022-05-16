package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<n;i++) {
			int result = 0, tmp = 0; 
			String s = bf.readLine();
			for(int j=0;j<s.length();j++) {
				char a = s.charAt(j);
				if(a == 'O') {
					tmp++;
					result += tmp;
				}
				else 
					tmp = 0;
			}
			System.out.println(result);
		}
		bf.close();
	}
}