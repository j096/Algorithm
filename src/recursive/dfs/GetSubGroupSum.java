package recursive.dfs;

import java.util.Scanner;

public class GetSubGroupSum {
	
	static int total =0;
	static int[] nums;
	static int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		nums = new int[n];
		for(int i=1;i<=n;i++) {
			nums[i-1] = scn.nextInt();
			total+=nums[i-1];
		}
		
		int chk = DFS(0,0);
		if(chk==-1)
			System.out.println("NO");
		
	}
	
	public static int DFS(int i,int sum) {
		int chk = 0;
		if(n == i) {
			if(sum*2 == total) {
				System.out.println("YES");
				return 1;
			}
		}
		
		else {
			chk = DFS(i+1,sum+nums[i]);
			if(chk==1)
				return 1;
			chk = DFS(i+1,sum);
			if(chk==1)
				return 1;
		}
		
		return -1;
		
	}

}
