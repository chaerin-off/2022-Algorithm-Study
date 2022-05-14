package Step5;

public class Main {
	
	int selfNum(int n) {
		int sum = n;
		while(n-10 > -10) {
			sum += n%10;
			n /= 10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Main w = new Main();
		
		int[] list = new int[10001];
		
		for(int i=1;i<10001;i++) {
			int n = w.selfNum(i);
			if(n<10001) list[n] = 1;
		}
		
		for(int i=1;i<10001;i++) 
			if(list[i] == 0) System.out.println(i);
	}
}