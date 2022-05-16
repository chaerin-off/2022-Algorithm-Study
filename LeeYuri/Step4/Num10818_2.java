// package Step4;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));	// 읽기 버퍼
		
		int n = Integer.parseInt(bf.readLine());
		int[] array = new int[n];
		
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);	// 한줄씩 읽어온 것을 하나씩 쪼개준다
		
		for(int i = 0;i<n;i++) 
			array[i] = Integer.parseInt(st.nextToken());	// int형으로 변환
		
		Arrays.sort(array);		// 오름차순으로 정렬
		
		System.out.println(array[0]+" "+array[n-1]);
		
		bf.close();	// 버퍼는 반드시 close해줘야 한다
	}
}