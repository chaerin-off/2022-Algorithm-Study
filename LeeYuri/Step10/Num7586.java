// package Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(bf.readLine());
		int[][] list = new int[N][3];	// 2차원 배열을 만든다. list[][0]에는 x값, list[][1]에는 y값, list[][2]는 덩치 등수를 저장한다.
		
		// x, y를 모두 받아 list에 저장
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(bf.readLine());
			
			list[i][0] = Integer.parseInt(st.nextToken());
			list[i][1] = Integer.parseInt(st.nextToken());
			list[i][2] = 1;
		}
		
		// 모든 list의 x, y값을 비교하여 둘 다 더 작은 사람의 덩치 등수를 ++ 한다.
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(j == i) continue;	// 자기 자신과는 비교하지 않는다.
				if(list[j][0] > list[i][0] && list[j][1] > list[i][1]) list[i][2]++;
			}
		}
		
		for(int k = 0; k < N; k++) {
			sb.append(list[k][2]).append(" ");
		}
		
		System.out.print(sb);
		bf.close();
	}
}