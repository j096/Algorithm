package dynamic_programming;

import java.util.Scanner;

public class WalkingStairsTopDown {
	static int dy[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		dy =new int[n+1];
		
		System.out.println(DFS(n));
	}
	
	static int DFS(int i) {
		if(dy[i]>0)
			return dy[i];
		if(i == 1 || i==2) {
			return i;
		}
		else {
			dy[i]=DFS(i-1)+DFS(i-2);
			return dy[i];
		}
	}

}
