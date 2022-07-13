import java.util.Scanner;

public class Main {
	static int getBiggest(int[] a, int order) {
		if(order > a.length) return 0;
		
		int i;
		int[] memory = new int[order];
		for(i=0; i<order; i++)
			memory[i] = -Integer.MAX_VALUE;
		
		for(int n: a) {
			if(n <= memory[order-1]) // memory의 마지막 요소(최소값)와 n와의 대소관계 비교
				continue;			 // n이 최소값보다 작거나 같으면 반복문을 실행하지 않아도 됨
			
			for(i=0; i<memory.length; i++) {
				if((i==0 && n > memory[i]) || (memory[i] < n && n < memory[i-1])) { // n이 memory[i]와 그 앞 값 사이에 있다면
					for(int j=memory.length-2; j> i-1; j--)						// n이 들어갈 자리를 찾은 것이니 값을 하나씩 뒤로 민다
						memory[j+1] = memory[j];
					memory[i] = n;
					break;
				}
			}
		}
		
		return memory[order-1]; 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseCount;
		int[] a = new int[10];
		
		caseCount = sc.nextInt();
		int[] b = new int[caseCount];
		
		for(int i=0; i<caseCount; i++) {
			for(int j=0; j<10; j++)
				a[j] = sc.nextInt();
			b[i] = getBiggest(a,3);
		}
		for(int i=0; i<caseCount; i++)
			System.out.println(b[i]);
	}

}
