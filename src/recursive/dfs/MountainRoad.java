package recursive.dfs;

import java.util.Scanner;

public class MountainRoad {
	
	public static int[][] road;
	public static int[][] move = {{-1,0},{0,-1},{1,0},{0,1}};
	public static int n,cnt=0,min=1000000,max=-1;
	public static int[] st= new int[2],ed = new int[2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		road = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				road[i][j]=s.nextInt();
				if(road[i][j]<min) {
					min = road[i][j];
					st[0]=i;
					st[1]=j;
				}
				if(road[i][j]>max) {
					max = road[i][j];
					ed[0]=i;
					ed[1]=j;
				}
			}
		}
		
		dfs(st[0],st[1]);
		
		System.out.println(cnt);
	}
	
	public static int dfs(int i,int j) {
		if(i==ed[0]&&j==ed[1]) {
			cnt++;
			return 0;
		}else {
			for(int[] m: move) {
				int mx = m[0];
				int my = m[1];
				if(i+mx>=0 && i+mx<n && j+my>=0 && j+my<n) {
					if(road[i+mx][j+my]>road[i][j])
						dfs(i+mx,j+my);

				}
			}
		}
		
		return 0;
		
	}

}
