/* BJ10818
   n개의 정수 중 최솟값과 최댓값을 구하는 프로그램
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// n: 정수의 개수, nums: 주어진 정수들
	int n;
	ArrayList<Integer> nums = new ArrayList<>();
	
	// Do Quick Sorting Algorithm
	int pivot = Math.abs(nums.size()/2);
	
	int partition(int left, int right) {
		int pivot, temp;
		int low, high;
		
		low = left;
		high = right+1;
		pivot = nums.get(left);
		
		do {
			do {
				low++;
			}while(low<=right && nums.get(low)<pivot);
			do {
				high--;
			}while(high>=left && nums.get(high)>pivot);
			
			if(low<high) {
				// Swap(low, high, temp);
				temp = nums.get(low);
				nums.set(low, nums.get(high));
				nums.set(high, temp);
			}
		}while(low<high);
		
		temp = nums.get(left);
		nums.set(left, nums.get(high));
		nums.set(high, temp);
		
		return high;
	}
	
	void quickSort(int left, int right) {
		if(left<right) {
			int q = partition(left, right);
			
			quickSort(left, q-1);
			quickSort(q+1, right);
		}
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		int n;
		
		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			main.nums.add(sc.nextInt());
		}
		
		main.quickSort(0, main.nums.size()-1);
		System.out.println(main.nums.get(0)+" "+main.nums.get(n-1));
	}

}
