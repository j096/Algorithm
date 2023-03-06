package datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavingPrincess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		
		Queue q = new LinkedList<Integer>();
		
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		
		while(q.size()>1) {
			for(int i=1;i<=k;i++) {
				int val = (int) q.poll();
				if(i%k!=0)
					q.add(val);
			}
		}
		
		System.out.print(q.poll());
		
	}

}
