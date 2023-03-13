import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		while(sc.hasNextLine()) {
			String[] str = sc.nextLine().split(" ");
			
			char[] s = str[0].toCharArray();
			char[] t = str[1].toCharArray();
			
			int s_length = 0;
			int t_length = t.length;
			
			boolean check = false;
			
			for(int i = 0; i < t_length; i++) {
				if(t[i] == s[s_length]) 
					s_length++;
				if(s_length == s.length) {
					check = true;
					break;
				}
			}
			
			if(check)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
