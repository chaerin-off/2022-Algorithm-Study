// package Step9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	static String underbar = "";
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		bw.flush();
		bw.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");	// 반복되는 부분이 아니기 때문에 먼저 출력
		
		answer(N);	// 재귀함수 호출
		
		bw.close();
	}
	
	public static void answer(int N) throws IOException {
		String line = underbar;	// 지역변수로 언더바를 따로 저장해줘야 호출 됐을때의 언더바 개수를 그대로 출력함(마지막에 언더바가 줄어들 수 있도록 함)
		if(N == 0) {			// 반복이 다 끝나면 마지막 말을 출력하고 return (더 이상 자기 자신 호출 x)
			bw.append(line + "\"재귀함수가 뭔가요?\"\n");
			bw.append(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
			bw.append(line + "라고 답변하였지.\n");
			return;
		}
		
		// answer1과 answer2의 line값은 서로 다르다. 
		
		bw.append(line + "\"재귀함수가 뭔가요?\"\n");
		bw.append(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		bw.append(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		bw.append(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		
		underbar += "____"; 
		
		answer(N-1);			// N-1하여 자기 자신을 호출
		
		bw.append(line + "라고 답변하였지.\n");
	}
}