package arraySearch;

import java.util.Scanner;

public class GetAppleTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int[][] farm = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				farm[i][j]= s.nextInt();
			}
		}
		
		int sum=0,st=n/2,ed=n/2;
		for(int i=0;i<n;i++) {
			for(int j=st;j<=ed;j++) {
				sum+=farm[i][j];

			}
			
			if(i<n/2) {
				st-=1;
				ed+=1;
			}else {
				st+=1;
				ed-=1;
			}
		}
		
		System.out.println(sum);
		
		
		
	}

}
