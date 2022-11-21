package recursive.dfs;

import java.util.Scanner;

public class GetNoDubPermutation {

	public static int[] ch,res;
	public static int n,m,cnt=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		
		res = new int[m];
		ch = new int[n+1];
		
		dfs(0);
		
		System.out.println(cnt);
	}
	
	public static int dfs(int level) {
		
		if(level == m) {
			for(int k : res) {
				System.out.print(k+" ");
			}
			
			System.out.println("");
			cnt++;
			return 0;
			
		}else {
			for(int i=1;i<=n;i++) {
				if(ch[i]==0) {
					ch[i]=1;
					res[level]=i;
					dfs(level+1);
					ch[i]=0;
				}
			}
		}
		return 0;
	}

}
