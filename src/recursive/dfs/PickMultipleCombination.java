package recursive.dfs;

import java.util.Scanner;

public class PickMultipleCombination {
	public static int n,k,m,cnt=0;
	public static int[] nums,chk;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		k = s.nextInt();
		
		nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=s.nextInt();
		}
		
		m = s.nextInt();
		
		chk = new int[n];
		dfs(0,-1,0);
		System.out.println(cnt);
	}
	
	public static int dfs(int level,int idx, int sum) {
		
		if(level==k) {
			if(sum%m==0) {
				cnt++;
			}
			return 0;
			
		}else {
			for(int j=idx+1;j<n;j++) {
					dfs(level+1,j,sum+nums[j]);
			}
		}
		
		return 0;
	}

}
