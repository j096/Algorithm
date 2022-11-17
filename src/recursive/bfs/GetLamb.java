package recursive.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetLamb {

	static int[] pos = new int[10001];
	static int[] chk = new int[10001];
	static int[] m = {1,-1,5};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		q.add(n);
		chk[n]=1;
		int pre=n;
		while(!q.isEmpty()) {
			for(int next : m) {
				next = pre+next;
				if((next>=1 && next<=10000) && chk[next] ==0) {
					pos[next]= pos[pre]+1;
					chk[next] = 1;
					q.add(next);
				}
			}
			pre = q.poll();
		}
		
		System.out.println(pos[e]);
		
		
	}

}
