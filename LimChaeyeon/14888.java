import java.util.Scanner;

public class Main {
	public static int MAX = Integer.MIN_VALUE;
	public static int MIN = Integer.MAX_VALUE;
	public static int[] nums;
	public static int[] ops;
	public static int numCount;
	
	static void getNums(Scanner sc, int[] nums) {		
		for(int i=0; i<nums.length; i++)
			nums[i] = sc.nextInt();
	}
	
	static void getOps(Scanner sc, int[] ops) {
		for(int i=0; i<4; i++)
			ops[i] = sc.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		numCount = sc.nextInt();  // 수의 개수
		nums = new int[numCount];
		getNums(sc, nums);		  // 주어진 정수들 저장
		
		ops = new int[4]; // 연산자 개수 배열
		getOps(sc, ops);  // 주어진 연산자 개수 저장
		
		dfs(nums[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
  // 모든 조합을 수행해야 하므로 DFS
	public static void dfs(int num, int i) {
		if(i == numCount) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int j=0; j<4; j++) {
			if(ops[j] > 0) {
				ops[j]--;
				
        // 재귀 호출
				switch(j) {
				case 0: dfs(num+nums[i], i+1); break;
				case 1: dfs(num-nums[i], i+1); break;
				case 2: dfs(num*nums[i], i+1); break;
				case 3: dfs(num/nums[i], i+1); break;
				}
				ops[j]++;
			}
		}
	}

}
