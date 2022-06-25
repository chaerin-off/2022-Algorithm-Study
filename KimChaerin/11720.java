import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	String s = sc.next(); //문자열로 숫자를 입력받는다.
    	
    	int sum = 0;
    	for(int i=0;i<N;i++) {
    		//charAt(index) 함수: String 문자열 중에서 한 글자만 선택해서 char 타입으로 변환해준다.
    		//여기에 '0'을 빼주어 char형을 int형으로 변환
    		sum += s.charAt(i)-'0';
    	}
    	System.out.println(sum);
    }
}
