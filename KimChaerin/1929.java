import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int M = sc.nextInt();
    	int N = sc.nextInt();

		boolean array[] = new boolean[1000001];
		Arrays.fill(array, true); //true는 약수, false는 약수가 아니라는 뜻
		
		array[0] = array[1] = false; //0과 1은 약수가 아니므로
		
		//에라토스테네스의 체로 거른다.
		for (int i = 2; i <= N; i++) { //i의 배수를 거르는 과정. 처음엔 2의 배수를 거른다.
			for(int k = 2; i*k <= N ; k++) {
				array[i*k] = false; //약수가 아니다.(=i의 배수이다.)
			}
		}
		for (int i = M; i <= N ; i++) {
			if(array[i] == true) //약수인 수들만 출력
				System.out.println(i);
		}
    }
}

/* 
 * 필기
 * ex) M=3 N=16일때
 * (i=2;i<=16;i++) 
 *  (k=2; i*k(2*2=4)<=16; k++)
 *   array[i*k(2*2=4)]=true; //약수가 아니다. 
 * 그다음 
 *  (k=3;i*k(2*3=6)<=16;k++) 
 *   array[6]=true;
 *  (k=4;i*k(2*4=8)<=16;k++) 
 *   array[8]=true;
 * 이렇게 최대수인 16(N)보다 작은 2(i)의 배수들은 모두 채에 걸러진다. 그다음 i인 3의 배수들도 걸러진다. 
 * 같은 방법으로 i를 16(N)까지 돌려보면 끝.
 */
