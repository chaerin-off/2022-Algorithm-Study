import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = 0;
    	int B = 0;
    	while(sc.hasNextInt()) { //sc.nextInt() 값이 정수면 true, 아니라면 false 반환
    		A = sc.nextInt();
    		B = sc.nextInt();
    		System.out.println(A+B);
    	}
    }
}
