package recursive.dfs;

import java.util.Scanner;

public class GetSubGroup {

	static char[] ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ch = new char[n];
		DFS(1,n);

	}
	
	public static int DFS(int n,int N) {
		if(n > N) {
			for(int i=0;i<N;i++) {
				if(ch[i]=='1')
					System.out.print(i+1);
				else
					System.out.print("");
			}
			System.out.println("");
			return -1;
		}
		else {
			ch[n-1]='1';
			DFS(n+1,N);
			ch[n-1]='0';
			DFS(n+1,N);
		}
		
		return 0;
			
	}

}
