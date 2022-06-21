import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int A = 0;
    	int B = 0;
    	while(true) {
    		if((A=sc.nextInt())!=0 && (B=sc.nextInt())!=0) {
        		System.out.println(A+B);
        	}
        	else {
        		return;
        	}
    	}
    }
}
