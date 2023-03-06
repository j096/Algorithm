package dynamic_programming;

import java.util.Scanner;

public class AlibabaBottomUp {
	static int[][] arr ;
	static int[][] dy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		arr = new int[n][n];
		dy = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		dy[0][0]=arr[0][0];
		for(int i=1;i<n;i++) {
			dy[i][0]= dy[i-1][0]+arr[i][0];
			dy[0][i]= dy[0][i-1]+arr[0][i];
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
					dy[i][j]=min(dy[i][j-1],dy[i-1][j])+arr[i][j];
					
			}
		}
		
		
		System.out.println(dy[n-1][n-1]);
		
		
		
		

	}
	
	public static int min(int a,int b) {
		
		if(a<b)
			return a;
		else
			return b;
	}

}
