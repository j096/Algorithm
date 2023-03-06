package array_search;

import java.util.Scanner;

public class GetCheckerBoardMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[][] board = new int [n][n];
		int max = -1,sumy=0,sumx=0,crss1=0,crss2=0;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			sumy=0;
			sumx=0;
			for(int j=0;j<n;j++) {
				sumy+=board[i][j];
				sumx+=board[j][i];
			}
			crss1+=board[i][i];
			crss2+=board[n-1-i][i];
			if(sumy>max)
				max=sumy;
			else if(sumx>max)
				max = sumx;
			else if(crss1>max)
				max = crss1;
			else if(crss2>max)
				max = crss2;
		}
		
		System.out.println(max);
		
		
	}

}
