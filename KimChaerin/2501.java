import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, K;
        int j=0;
		ArrayList<Integer> list = new ArrayList<>();
        
		N=sc.nextInt();
		K=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			if((N%i)==0) { //i가 N의 약수라면
				list.add(i); //리스트에 추가
			}
		}
		if(list.size()<K) { //약수의 개수가 K개보다 작다면 0 출력
			System.out.println("0"); 
		}
		else {
			list.sort(Comparator.naturalOrder()); //리스트를 오름차순으로 정렬
			System.out.println(list.get(K-1)); //리스트의 인덱스는 0부터 시작하기 때문에 K-1번째를 출력
		}	
	}
}
