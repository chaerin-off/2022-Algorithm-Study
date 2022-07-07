import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	//위쪽
    	for(int i=1;i<=N;i++) {
    		for(int j=1;j<=N-i;j++) {
    			System.out.print(" ");
    		}
    		for(int k=1;k<=i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    	//아래쪽
    	for(int i=1;i<=N-1;i++) {
    		for(int j=1;j<=i;j++) { //반대로 출력
    			System.out.print(" ");
    		}
    		for(int k=1;k<=N-i;k++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
}
