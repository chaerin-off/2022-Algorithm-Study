// package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(bfr.readLine());
		
		for(int i = 0; i < N; i++) 
			list.add(Integer.parseInt(bfr.readLine()));
		
		list.sort(null);
		
		for(int n : list) 
			System.out.println(n);
	}
}