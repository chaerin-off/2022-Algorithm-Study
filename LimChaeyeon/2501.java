import java.util.ArrayList;
import java.util.Scanner;

public class DivisorTest {
	int inputInt, order;
	ArrayList<Integer> q = new ArrayList<>();
	
	public DivisorTest(int input, int order) {
		this.inputInt = input; // N
		this.order = order;	   // K
		
		for(int i=1; i<inputInt+1; i++) {
			if(inputInt%i == 0)
				q.add(inputInt/i);
		}
		
		getK(order);
	}
	
	public void getK(int order) {
		if(q.size() < order)
			System.out.println(0);
		else
			System.out.println(q.get(q.size()-order));
	}
	
	public static void main(String[] args) {
		DivisorTest dt;
		Scanner sc = new Scanner(System.in);
		int inputInt, order;

		inputInt = sc.nextInt();
		order = sc.nextInt();
		
		if(inputInt >= 1 && inputInt <= 10000)
			if(order >= 1 && order <= inputInt)
				dt = new DivisorTest(inputInt, order);
	}

}
