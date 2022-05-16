// package Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int[] array = new int[9];
		int index = 0, max = 0;
		
		for(int i = 0;i<9;i++) 
			array[i] = Integer.parseInt(bf.readLine());			
			
		for(int i=0;i<9;i++) {
			if(array[i] > max) { 
				max = array[i];
				index = i;
			}
		}
				
		System.out.print(max+"\n"+(index+1));
		
		bf.close();
	}
}