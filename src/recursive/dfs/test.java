package recursive.dfs;

import java.util.Scanner;

public class test {
	static int[] nums;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		nums = new int[N];
		int total = 0;
		for(int i=0;i<N;i++) {
			nums[i]=scanner.nextInt();
			total += nums[i];
		}
		
		int chk = DFS(0,0,total);
		
		if(chk == -1)
			System.out.println("NO");
	}
	
	public static int DFS(int i,int sum,int total) {
		if(sum == total/2) {
			System.out.println("YES");
			return 1;
		}
		if(i==nums.length) {
			return -1;
		}
		else {
			int chk =DFS(i+1,sum+nums[i],total);
			if(chk == 1)
				return chk;
			chk =DFS(i+1,sum,total);
			if(chk == 1)
				return chk;
		}
		
		return -1;
	}

}
