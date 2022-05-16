import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            list[i] = sc.nextInt();
            sum += list[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) { //list[i+1]의 뜻: i, i+1번째 조사
                if (sum - list[i] - list[j] == 100) {
                    list[i] = 0;
                    list[j] = 0;
                    Arrays.sort(list);
                    for(int n:list) {
                        if(n!=0)
                            System.out.println(n);
                    }
                    return;
                }
            }
        }
    }
}
