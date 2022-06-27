import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String s = sc.next();
    	
    	for(int i=0;i<s.length();i++) {
    		System.out.print(s.charAt(i));
    		if(i%10==9) { //i가 9,19,29...일 때마다 다음줄로 개행한다. i는 0부터 시작하므로 9까지가 열글자
    			System.out.println();
    		}
    	}
    }
}
