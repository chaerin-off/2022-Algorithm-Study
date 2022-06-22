import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i =0;i<T;i++) {
    		String[] s = sc.next().split(","); //nextLine()이 아닌 next()를 써서 문자열을 입력받을 것
    		int a = Integer.parseInt(s[0]);
        	int b = Integer.parseInt(s[1]);
        	System.out.println(a+b);
    	}
    }
}
