import java.util.Scanner;
 
public class Main {
	//a와 b의 최대공약수 = b와 a%b의 최대공약수라는 성질을 이용하여 재귀함수로 구현
    static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int gcd = gcd(n, m); //최대 공약수
        int lcm = (n*m/gcd); //최소 공배수
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
