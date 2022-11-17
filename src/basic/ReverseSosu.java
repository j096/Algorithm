package basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseSosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		int N=scanner.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i=1;i<=N;i++) {
			nums.add(scanner.nextInt());
		}
		
		for(int i=1;i<=N;i++) {
			int num=reverse(nums.get(i-1));
			if(isPrime(num))
				System.out.print(num+" ");
		}
		

	}
	
	public static int reverse(int num) {
		int rev=0;
		
		for(int i=1;num>0;i++) {
			int t = num%10;
			rev=rev*10+t;
			num=num/10;
		}
		
		return rev;
	}
	
	public static boolean isPrime(int num) {
		if(num==1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
