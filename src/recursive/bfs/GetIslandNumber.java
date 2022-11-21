package recursive.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GetIslandNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		int[][] move = {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
		Queue<int[]> q = new LinkedList<>();
		int cnt =0;
		//시작점이 여러개이므로 배열을 모두 돌면서 섬을 찾는다.(이미 찾은 섬은 0으로 제외시켜줌)
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==1) {
					q.add(new int[] {i,j});
					arr[i][j]=0;
					cnt++;
					while(!q.isEmpty()) {
						int[] pos = q.poll();
						for(int[] m : move) {
							int x = m[0]+pos[0];
							int y = m[1]+pos[1];
							if(x>=0 && x<n && y>=0 && y<n && arr[x][y]!=0) {
								arr[x][y]=0;
								q.add(new int[] {x,y});
							}
						}
					}
				}
			}
		}
		
		System.out.println(cnt);
	}

}
