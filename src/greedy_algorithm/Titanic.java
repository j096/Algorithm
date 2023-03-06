package greedy_algorithm;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Titanic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n =  s.nextInt();
		int max = s.nextInt();
		
		Stack<Integer> arr = new Stack<>();
		for(int i=0;i<n;i++) {
			arr.add(s.nextInt());
		}
		
		Collections.sort(arr);
		int idx=0,cnt=0;
		
		while(!arr.isEmpty()) {
			if(arr.peek()+arr.elementAt(0)>max) {
				cnt++;
				arr.pop();
			}else {
				arr.pop();
				if(!arr.isEmpty())
					arr.remove(0);
				cnt++;
			}
				
		}

		
		System.out.println(cnt);
		
	}

}
