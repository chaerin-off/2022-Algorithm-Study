import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> in = new ArrayList<>();
		int n=0;
		n = sc.nextInt();
		System.out.println(fibonacci(n));
	}
	
  //재귀 함수
	static int fibonacci(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
