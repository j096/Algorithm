package dynamic_programming;

import java.util.Scanner;

public class LongestIncreasingSubsequence {
	static int[] nums;
	static int[] dy;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		nums = new int[n+1];
		dy = new int[n+1];
		for(int i=1;i<=n;i++) {
			nums[i]=s.nextInt();
		}
		dy[1]=1;
		for(int i=2;i<=n;i++) {
			int max =0;
			for(int j=i-1;j>=1;j--) {
				if(nums[j]<nums[i] && dy[j]>max) {
					max=dy[j];
				}
			}
			dy[i]= max+1;
		}
		
		System.out.println(max(dy));
		
		
	}
	
	public static int max(int[] dy) {
		int max = 0;
		for(int i=1;i<dy.length;i++) {
			if(dy[i]>max)
				max = dy[i];
		}
		
		return max;
	}
	

}
