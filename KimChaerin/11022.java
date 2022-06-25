import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	for(int i=0;i<T;i++) {
    		int A = sc.nextInt();
    		int B = sc.nextInt();
    		System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B)); //정수를 더할때는 ()로 우선순위 정한 뒤 출력하기
    	}
    }
}
