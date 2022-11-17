package recursive.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EscapingMaze {
	static int N = 7;
	static int[][] maze = new int[N][N];
	static int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
	static Queue<int[]> q = new LinkedList<>();
	static int[][] chk = new int[N][N];
	static int[][] dis = new int[N][N];

	static int min = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				maze[i][j] = s.nextInt();
			}
		}
		
		q.add(new int[2]);
		int cnt=1;
//		while(true) {
//			if(cnt > 49) {
//				if(cnt==min)
//					min =-1;
//				break;
//			}
//				
//			int size = q.size();
//			for(int e=0;e<size;e++) {
//				int[] pre = q.poll();
//				int a = pre[0],b=pre[1];
//				for(int i=0;i<4;i++) {
//					int k=move[i][0],m=move[i][1];
//					if(a+k>=0&&a+k<N&&b+m>=0&&b+m<N) {
//						if(maze[a+k][b+m]==0 && chk[a+k][b+m]==0) {
//							int[] tmp = {a+k,b+m};
//							q.add(tmp);
//							chk[a+k][b+m]=1;
//							
//							if(a+k==N-1&&b+m==N-1) {
//								if(cnt<min)
//									min = cnt;
//								break;
//							}
//						}
//						
//					}
//				}
//			}
//			cnt++;
//		}

		
			while(!q.isEmpty()){
				int[] pre = q.poll();
				int a = pre[0],b=pre[1];
				for(int i=0;i<4;i++) {
					int k=move[i][0],m=move[i][1];
					if(a+k>=0&&a+k<N&&b+m>=0&&b+m<N) {
						if(maze[a+k][b+m]==0 && chk[a+k][b+m]==0) {
							int[] tmp = {a+k,b+m};
							q.add(tmp);
							chk[a+k][b+m]=1;
							dis[a+k][b+m]=dis[a][b]+1;
						}
						
					}
				}
			}
			if(dis[N-1][N-1]==0)
				dis[N-1][N-1]=-1;
		
		System.out.println(dis[N-1][N-1]);
		
	}
	
}
