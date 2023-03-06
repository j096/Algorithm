package array_search;

import java.util.Scanner;

public class GetPalindromicNumberCount {
	final static int n = 7,numLen =5;

	public static void main(String[] args) {
		int[][] board = new int[n][n];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]=sc.nextInt();
			}
		}
		
		int cnt=0;
		for(int i=0;i<n;i++) {
			int[] num = new int[numLen];
			for(int j=0;j<n;j++) {
				if(j+numLen <= n) {
					//가로 5칸 확인
					for(int k=0;k<numLen;k++) {
						num[k] = board[i][j+k];
					}
					
					if(isPalindromic(num)) {
						cnt++;
					}

				}
				if(i+numLen <= n) {
					//세로 5칸 확인
					for(int k=0;k<numLen;k++) {
						num[k] = board[i+k][j];
					}
					
					if(isPalindromic(num)) {
						cnt++;
					}
				}
				
			}

		}
		
		System.out.println(cnt);
		
	}
	
	//회문수인지 확인
	public static boolean isPalindromic(int[] arr) {
		
		for(int i=0;i<Math.floor(numLen/2);i++) {
			if(arr[i]==arr[numLen-i-1])
				continue;
			else
				return false;
		}
		
		return true;
		
	}
}
