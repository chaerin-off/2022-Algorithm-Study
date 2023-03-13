// package Step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bfr.readLine());
		
		int N = Integer.parseInt(st.nextToken());	// 응시자 수
		int k = Integer.parseInt(st.nextToken());	// 상을 받는 사람의 수
		
		st = new StringTokenizer(bfr.readLine());
		Integer[] score = new Integer[N];			// Integer 래퍼클래스 객체 배열을 만든다. (내림차순 정렬 함수를 사용하기 위함)
		
		for(int i = 0; i < N; i++) 
			score[i] = Integer.parseInt(st.nextToken());	// 배열에 점수를 저장한다.
		
		Arrays.sort(score, Collections.reverseOrder());		// 내림차순으로 배열을 정렬한다.
		
		System.out.println(score[k-1]);				// 인덱스가 0부터 시작하는 것을 생각하여 k-1값을 출력한다.
	}
}