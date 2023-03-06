package array_search;

import java.util.Scanner;

public class ReverseCard {
	static int[] card = new int[21];
	static int[][] range = new int[10][2];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0;i<=20;i++) {
			card[i] = i;
		}
		
		Scanner s = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<2;j++) {
				range[i][j] = s.nextInt();
			}
			reverse(range[i][0],range[i][1]);
		}
		
		for(int i=1;i<=20;i++) {
			System.out.print(card[i]+" ");
		}
		
	}
	
	public static void reverse(int a,int b) {
		int cnt = a+b;
		for(int i=a;i<=a+Math.ceil((b-a)/2);i++) {
			int tmp = card[i];
			card[i] = card[cnt-i];
			card[cnt-i] = tmp;
		}
	}

}
