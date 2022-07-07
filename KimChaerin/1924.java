import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; //월별 일 수
    	
    	int month = sc.nextInt();
    	int day = sc.nextInt();

    	int sum = day; //X월 Y일 중 Y일 먼저 더하기
    	for(int i=0;i<month-1;i++) { //X월 전의 일 수들을 모두 더하기
    		sum += days[i]; 
    	}
    	
    	switch(sum%7) {
        case 0 : System.out.println("SUN"); break;
        case 1 : System.out.println("MON"); break;
        case 2 : System.out.println("TUE"); break;
        case 3 : System.out.println("WED"); break;
        case 4 : System.out.println("THU"); break;
        case 5 : System.out.println("FRI"); break;
        case 6 : System.out.println("SAT"); break;
        }
    }
}
