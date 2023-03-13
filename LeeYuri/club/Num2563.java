package GDSC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paper[][] = new int[100][100];	// ��ȭ���� ���� ũ���� �迭�� �����.
		
		int N = sc.nextInt();				// �������� ������ N�� �����Ѵ�.
		int result = 0;
		
		for(int i = 0; i < N; i++) {		// N��ŭ �ݺ�
			int x = sc.nextInt();			// �����̸� ���� ��ġ�� x, y������ ���� ��´�.
			int y = sc.nextInt();
			
			for(int j = x; j < x + 10; j++) { // �������� ũ�Ⱑ 10�̴� 10x10��ŭ ��ȭ�� �迭�� 1�� ǥ���Ѵ�.
				for(int k = y; k < y + 10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		for(int j = 0; j < 100; j++) {
			for(int k = 0; k < 100; k++) {
				if (paper[j][k] == 1) result++;	// �迭���� 1�� ǥ�õ� ��ŭ result���� ������Ų��.
			}
		}
		
		System.out.println(result);
		
	}
}
