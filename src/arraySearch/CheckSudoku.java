package arraySearch;

import java.util.Scanner;

public class CheckSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 9;
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		if(check(arr,n))
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	
	public static boolean check(int[][] arr,int n) {
		//1. 전체 배열에서 각 열의 숫자가 1~9로 중복없는지 체크
		int[] check = new int[n+1];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				check[arr[i][j]] += 1;
				if(check[arr[i][j]] > i+1) {
					return false;
				}
			}
		}
		//2. 3*3 부분배열 9개에서 각각 1~9로 중복없는지 체크
		check = new int[n+1];
		for(int k=0;k<n;k++) {
			for(int i=k/3*3;i<k/3*3+3;i++) {
				for(int j=(k%3)*3;j<(k%3)*3+3;j++) {
					check[arr[i][j]] += 1;
					if(check[arr[i][j]] > k+1) {
						return false;
					}
				}
			}

		}
		
		return true;
	}

}


