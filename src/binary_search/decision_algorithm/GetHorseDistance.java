package binarySearch.decisionAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class GetHorseDistance {
	static int[] xi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int c = scanner.nextInt();
		
		int min=2000000000,max=-1,mid=0;
		xi = new int[n];
		
		for(int i=0;i<n;i++) {
			xi[i]=scanner.nextInt();
			if(xi[i]<min)
				min = xi[i];
			if(xi[i]>max)
				max = xi[i];
		}
		
		Arrays.sort(xi);
		
		int chk,res=0;
		while(min <= max) {
			mid = (min + max) / 2;
			chk = check(mid);
			if(chk >= c) {
				res = mid;
				min = mid+1;
			}else {
				max = mid - 1;
			}
		}
		
		System.out.println(res);


		
				
	}
	
	public static int check(int mid) {
		int cnt = 1;
		int cmp = xi[0];
		for(int i=1;i<xi.length;i++) {
			if(xi[i]-cmp>=mid) {
				cnt +=1;
				cmp = xi[i];
			}
			
		}
		
		return cnt;
	}

}
