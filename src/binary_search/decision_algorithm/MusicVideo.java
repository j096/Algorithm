package binarySearch.decisionAlgorithm;

import java.util.Scanner;

public class MusicVideo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		int[] time = new int[N];
		int mid = 0,min = 1, max = 0,total=0,maxx=0;
		for(int i=1;i<=N;i++) {
			time[i-1] = scanner.nextInt();
			total += time[i-1];
			if(time[i-1]>max)
				maxx = time[i-1];
		}
	
		max = total;
		int cnt =0,res=0;
		while(min<=max) {
			mid = (min+max)/2;
			int sum=0;
			cnt = 0;
			for(int i=0;i<N;i++) {
				sum += time[i];
				if(sum>mid) {
					cnt=cnt+1;
					sum = time[i];
				}
			}
			cnt +=1;
			
			if(maxx < mid && cnt <= M) {
				res = mid;
				max = mid-1;
			}else {
				min = mid+1;
			}
		}
		
		System.out.println(res);
		
	}

}
