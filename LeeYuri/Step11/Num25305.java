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
		
		int N = Integer.parseInt(st.nextToken());	// ������ ��
		int k = Integer.parseInt(st.nextToken());	// ���� �޴� ����� ��
		
		st = new StringTokenizer(bfr.readLine());
		Integer[] score = new Integer[N];			// Integer ����Ŭ���� ��ü �迭�� �����. (�������� ���� �Լ��� ����ϱ� ����)
		
		for(int i = 0; i < N; i++) 
			score[i] = Integer.parseInt(st.nextToken());	// �迭�� ������ �����Ѵ�.
		
		Arrays.sort(score, Collections.reverseOrder());		// ������������ �迭�� �����Ѵ�.
		
		System.out.println(score[k-1]);				// �ε����� 0���� �����ϴ� ���� �����Ͽ� k-1���� ����Ѵ�.
	}
}