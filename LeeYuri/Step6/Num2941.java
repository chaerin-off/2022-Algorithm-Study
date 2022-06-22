// package Step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {
	public static void main(String[] args) throws IOException{
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			String s = bf.readLine();
			// 변경된 크로아티아 알파벳중에서 두글자 이상인 것들을 배열에 저장
			String[] sd = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=", };
			
			// 입력받은 문자열에서 sd에 저장한 문자열이 포함되어있을 경우 "."으로 변경
			for(String n : sd)
				s = s.replace(n, ".");
			
			// 문자열의 길이 출력
			System.out.println(s.length());
			
			bf.close();
	}
}