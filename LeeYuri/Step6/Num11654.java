// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		char c = bf.readLine().charAt(0);
		byte n = (byte)c;
		System.out.println(n);
		bf.close();
	}
}