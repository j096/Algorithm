package recursive.dfs;

import java.util.Scanner;

public class Baduke {
	static int[] w ;
	static int c;
	static int total=0;
	static int result = -100;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		int n = s.nextInt();
		w = new int[n];
		for(int i=0;i<n;i++) {
			w[i] = s.nextInt();
			total+=w[i];
		}
		DFS(0,0,0);
		System.out.println(result);
	}
	
	
	public static int DFS(int n, int sum, int tsum) {
		if(sum+(total-tsum)<result)
			//현재부분집합의 합+아직 판단안한 수들의 합이 이미 구한 결과값보다 작으면 더이상 판단할 필요 없다->시간단축
			return -1;
		if(sum > c)
			return -1;
		if(n==w.length) {
			if(sum>result)
				result =sum;
			return 1;
		}
		else {
			DFS(n+1,sum+w[n],tsum+w[n]);
			DFS(n+1,sum,tsum+w[n]);
		}
		
		return 0;
	}

}
