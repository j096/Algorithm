package datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Stack<String> st = new Stack<String>();
		
		char[] cc = s.toCharArray();
		
		int cnt = 0;
		for(int i=0;i<cc.length;i++) {
			if(cc[i]=='(')
				st.add("1");
			else {
				st.pop();
				if(cc[i-1]=='(')//레이저끝남
					cnt +=st.size();
				else//막대기끝남
					cnt +=1;
			}
				
		}
		
		System.out.println(cnt);
		
	}
}
