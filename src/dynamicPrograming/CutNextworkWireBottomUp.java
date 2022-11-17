package dynamicPrograming;

import java.util.Scanner;

public class CutNextworkWireBottomUp {

	static int[] dy ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		dy = new int[n+1];
		//f(n) = f(n-2)+f(n-1)
		dy[1]=1;
		dy[2]=2;
		for(int i=3;i<=n;i++)
			dy[i]=dy[i-2]+dy[i-1];
		
		
		System.out.println(dy[n]);
		
	}

}
