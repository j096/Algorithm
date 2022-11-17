package recursive.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetAppleTree {
	
	static int [][] pos;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		pos = new int[n][n];
		int move[][] = {{-1,0},{0,1},{1,0},{0,-1}};
		int chk[][]= new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				pos[i][j]= s.nextInt();
			}
		}
		
		Queue<int[]> q = new LinkedList<>();
		int start = (int) Math.floor(n/2);
		int[] t = {start,start};
		q.add(t);
		int result = 0,lvl=0;
		while(true) {
			if(lvl==n/2)
				break;
			int size = q.size();
			for(int e=0;e<size;e++) {
				int[] pre = q.poll();
				int prex = pre[0];
				int prey = pre[1];
				for(int i=0;i<4;i++) {
					int a = prex+move[i][0];
					int b = prey+move[i][1];
					if(chk[a][b]==0) {
						result += pos[a][b];
						int[] t2 = {a,b};
						q.add(t2);
						chk[a][b]=1;
					}
				}
			}
			lvl++;
		}
		
		System.out.println(result);
	}

}
