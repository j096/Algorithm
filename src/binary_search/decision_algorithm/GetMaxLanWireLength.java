package binary_search.decision_algorithm;

import java.util.Scanner;

public class GetMaxLanWireLength {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		int N = scanner.nextInt();
		int[] lans = new int[K];
		int max=0,min=1;
		
		for(int i=1;i<=K;i++) {
			lans[i-1]=scanner.nextInt();
			if(lans[i-1]>max)
				max=lans[i-1];
		}
		
		int mid = 0;
		int cnt = 0;
		int res = 0;
		while(min<=max) {
			mid = (min+max)/2;
			cnt = 0;
			for(int i=1;i<=K;i++) {
				cnt += lans[i-1]/mid;
			}
			if(cnt < N) {
				max = mid-1;
			}else if (cnt >= N) {
				res = mid;
				min = mid+1;
			}
		}
		
		System.out.println(res);

		
	}
}
