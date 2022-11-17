package recursive.dfs;

import java.util.Scanner;

public class DupPermutation {
	public static int n,m;
	public static int cnt;
	public static int[] res;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		res = new int[m];
		dfs(0);
		System.out.println(cnt);
	}
	
	public static int dfs(int i) {
		
		if(i==m) {
			for(int j=0;j<m;j++)
				System.out.print(res[j]+" ");
			System.out.println("");
			cnt++;
			return -1;
		}
		else {
			for(int j=1;j<=n;j++) {
				res[i]=j;
				dfs(i+1);
			}
		}
		
		return 1;
		
	}
}
