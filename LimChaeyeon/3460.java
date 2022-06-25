import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	int i;
	int inputInt;
	ArrayList<Integer> numOrder = new ArrayList<>();
	
	public Main(int ii) {
		this.inputInt = ii;
		
		findOne(inputInt);
		
		for(i=numOrder.size()-1; i>0; i--) {
			System.out.print(numOrder.get(i)+" ");
		}
		System.out.println(numOrder.get(i));
		
		numOrder.clear();
	}
	
	void findOne(int inputInt) {
		String binary = Integer.toBinaryString(inputInt);
		
		for(int j=0; j<binary.length(); j++) {
			if(binary.charAt(j) == '1') {
				numOrder.add(binary.length()-j-1);
			}
		}
	}
	
	public static void main(String[] args) {
		Main main;
		Scanner sc = new Scanner(System.in);
		int testCase, ii;
		
		testCase = sc.nextInt();
		
		while(testCase != 0) {
			ii = sc.nextInt();
			main = new Main(ii);
			
			testCase--;
		}
	}

}
