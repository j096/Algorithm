package basic;

import java.util.Scanner;

public class PlatonicSolidSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		int sum[] = new int[n+m+1];
		
		int max = 0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				int tot = i+j;
				sum[tot]=sum[tot]+1;
				if(sum[tot] > max)
					max = tot;
			}
		}
		
		for(int i=1;i<=n+m;i++) {
			if(sum[i]==max)
				System.out.print(i+" ");
				
		}
		
		
	}

}
