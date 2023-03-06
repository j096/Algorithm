package datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class GetMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		String[] in = scanner.nextLine().split(" ");
		char[] num = in[0].toCharArray();
		int cnt = Integer.parseInt(in[1]);
		for(char n : num) {
			//자기앞에오는 숫자가 자기보다 작으면 삭제(카운트 소진전까지)
			int number = Character.getNumericValue(n);
				while(cnt > 0 && stack.size()>0 && number>stack.peek()) {
						stack.pop();
						cnt-=1;
			}
			stack.add(number);
		}
		int size=stack.size()-cnt;
		for(int i=0;i<size;i++) {
			System.out.print(stack.get(i));
				
		}
		

	}

}
