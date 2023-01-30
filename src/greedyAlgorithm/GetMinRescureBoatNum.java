package greedyAlgorithm;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class GetMinRescureBoatNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		Stack<Integer> stk= new Stack<Integer>();
		
		for(int i=0;i<n;i++) {
			stk.add(s.nextInt());
		}
		
		 stk.sort(Comparator.comparingInt(e1->e1));
		 
		 //1.가장 적은 몸무게와 큰 몸무게가 한 보트를 탈 수 있으면 둘 다 pop
		 //2. 한 보트 못타면 큰 몸무게만 pop
		 //3. 한 명이 남는 경우 스택의 첫번째이자 마지막 값이 되어 두번 더해지므로 바로 카운트하고 break
		 int cnt =0;
		 while(!stk.isEmpty()) {
			 if(stk.size()==1) {
				 cnt++;
				 break;
			 }
			 if(stk.peek()+stk.firstElement()<=m) {
				 stk.pop();
				 stk.remove(0);
			 }else {
				 stk.pop();
			 }
			 cnt++;
		 }
		 
		 System.out.println(cnt);
		
	}

}
