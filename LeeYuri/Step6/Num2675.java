// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(bf.readLine());	// 첫 번째 줄에 있는 문자(숫자임)를 int형으로 변경
		
		for(int i=0;i<num;i++) {	
			String S = bf.readLine();
			int n = S.charAt(0) - '0';		// 몇 번 반복할 건지 0번째에 써있으므로 읽어와 int형으로 변경 (0만큼 빼주면 원하는 숫자값의 아스키코드를 얻을 수 있음)
			
			for(int j=2;j<S.length();j++) {	// 한 줄의 2번째 인덱스부터 문자가 시작되기 때문에 j는 2부터 시작
				for(int l=0;l<n;l++) {		
					System.out.print(S.charAt(j));
				}
			}
			System.out.print("\n");
		}
		bf.close();
	}
}