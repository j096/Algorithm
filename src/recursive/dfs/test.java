package recursive.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
	
	static int[] move = {-1,1,5};
	static int[] chk = new int[10001];
	static int[] cnt = new int[10001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		q.add(s);
		chk[s]=1;
		int pre = s;
		while(!q.isEmpty()) {
			for(int i=0;i<3;i++) {
				int n = pre+move[i];
				if(n> 0 && n< 10001 && chk[n]!=1) {
					cnt[n] = cnt[pre]+1;
					q.add(n);
					chk[n]= 1;
				}

			}
			pre = q.poll();
		}
		
		System.out.println(cnt[e]);
		
	}
	

}
