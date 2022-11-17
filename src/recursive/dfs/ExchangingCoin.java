package recursive.dfs;

import java.util.Arrays;
import java.util.Scanner;

public class ExchangingCoin {
	static int[] coin;
	static int min=500,ex;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		coin = new int[n];
		for(int i=0;i<n;i++) {
			coin[i] = s.nextInt();
		}
		
		ex = s.nextInt();
		Arrays.sort(coin);
		int chk = dfs(0,0);
		System.out.print(chk);
	}
	
	
	public static int dfs(int sum,int cnt) {
		if(cnt > min) {//cutting edge
			return -1;
		}
		if(sum>ex) {//cutting edge
			return -1;
		}
		if(sum==ex) {
			if(cnt<min)
				min=cnt;
			return min;
		}else {
			int chk=0;
			for(int i=coin.length-1;i>=0;i--) {
				dfs(sum+coin[i],cnt+1);
			}
		}
		
		return min;
	}

}
