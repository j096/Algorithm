package basic;

import java.util.Scanner;

public class GetMaxDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int nums[] = new int[n];
		
		int max=0,num=0;
		for(int i=0;i<n;i++) {
			nums[i] = s.nextInt();
			int sum = digit_sum(nums[i]);
			if(sum>max) {
				max = sum;
				num = nums[i];
			}
		}
		
		System.out.println(num);
		
		
		
	}
	
	
	public static int digit_sum(int x) {
		int tmp= x,sum=0;
		while(x>0) {
			sum += x%10;
			x = x/10;
		}
		return sum;
	}

}
