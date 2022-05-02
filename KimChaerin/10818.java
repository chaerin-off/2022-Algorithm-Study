import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		while (N != 0) {
			list.add(sc.nextInt());
			N--;
		}
		System.out.println(Collections.min(list)+" "+Collections.max(list));
	}
}