import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	int platNum;
	int gettingOn, gettingOff; // 승차, 하차 인원
	static int capacity = 0; // 현재 타고 있는 사람 수 (계산이 연속적으로 이뤄지므로 정적 변수로 정의
		
	public Main(int off, int on) {
		gettingOn = on;
		gettingOff = off;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Main> platforms = new ArrayList<>();
		ArrayList<Integer> platformCapa = new ArrayList<>();
		
		for(int i=1; i<11; i++) {
			Main platform = new Main(sc.nextInt(), sc.nextInt()); // 각 역 인스턴스
			capacity = capacity - platform.gettingOff + platform.gettingOn; // 역에서의 타고 있는 사람 수
			platformCapa.add(capacity); // 비교를 위해 배열에 저장
		}
		
		int max = platformCapa.get(0);
		for(int j=1; j<platformCapa.size(); j++) {
			if(platformCapa.get(j)>max) {
				max = platformCapa.get(j);
			}
		}
		
		System.out.println(max);
	}

}
