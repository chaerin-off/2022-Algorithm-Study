// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()), sum = 0;
		String s = bf.readLine();
		
		for(int i=0;i<n;i++) 
			sum += Integer.parseInt(s.charAt(i) + "");
			
		System.out.print(sum);
		
		bf.close();
	}
}