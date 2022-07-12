import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=2;
		while(i<=N) {
			if(N%i==0) { //소인수분해(i로 나눠지면 i를 출력한다)
				System.out.println(i);
				N = N/i;
			}
			else {
				i++;
			}
		}
	}
}
