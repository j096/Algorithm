package dynamicPrograming;

import java.util.Scanner;

public class CutNetworkWireTopDown {
	static int[] dy;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		dy = new int[n+1];
		System.out.println(DFS(n));
	}
	
	public static int DFS(int i) {
		if(dy[i]>0)//메모이제이션
			return dy[i];
		if(i==1 || i==2)//dy[1]=1,dy[2]=2
			return i;
		else {
			dy[i]=DFS(i-1)+DFS(i-2);
			return dy[i];
		}
	}

}
