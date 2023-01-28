package basic;

import java.util.Scanner;

public class RepresentativeValue {
	static int nums[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		nums = new int[n];
		
		double tot=0;
		for(int i=0;i<n;i++) {
			nums[i]=s.nextInt();
			tot += nums[i];
		}
		
		int avg =(int) Math.round(tot/n);
		int tmp = 0,min =1000,maxNum = 0,res = 0;
		for(int i=0;i<n;i++) {
			tmp = (int) Math.abs(avg - nums[i]);
			if(tmp < min) {
				min =tmp;
				maxNum = nums[i];
				res = i+1;
			}else if(tmp == min) {
				if(maxNum < nums[i]) {
					maxNum = nums[i];
					res = i+1;
				}
			}
		}
		
		System.out.println(avg+" "+res);

	}

}
