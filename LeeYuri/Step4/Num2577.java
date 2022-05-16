// package Step4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());

		int result = A*B*C;
		int[] array = new int[10];
		
		while(result-10 > -10) {
			array[result%10]++;
			result /=10;
		}
		
		for(int n:array)
			System.out.println(n);
		
		bf.close();
	}
}