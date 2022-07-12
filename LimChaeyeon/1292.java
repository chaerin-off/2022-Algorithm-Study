import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Integer> getArray(int end) {
		ArrayList<Integer> a = new ArrayList<>();
		int i = 0;
		
		while (i<end) {
			for(int j=0; j<i+1; j++)
				a.add(i+1);
			i++;
		}
		
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt(), end = sc.nextInt();
		ArrayList<Integer> a = getArray(end);
		int sum = 0;
		
		for(int i=start; i<end+1; i++)
			sum += a.get(i-1);
		System.out.println(sum);
	}
}
