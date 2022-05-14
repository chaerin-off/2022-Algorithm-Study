// package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] array = new int[42];
		
		for(int i=0;i<10;i++) 
			array[Integer.parseInt(bf.readLine())%42]++;
		
		int count = 0;
		
		for(int n:array)
			if(n > 0) count++;
		
		System.out.print(count);
		
		bf.close();
	}
}