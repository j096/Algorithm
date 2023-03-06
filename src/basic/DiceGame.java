package basic;

import java.util.Arrays;
import java.util.Scanner;

public class DiceGame {
	
	static int diceCnt = 3;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int reward=0;
		int[][] arr = new int[n][diceCnt];
		for(int i=0;i<n;i++) {
			for(int j=0;j<diceCnt;j++) {
					arr[i][j] = sc.nextInt();
			}
			Arrays.sort(arr[i]);
			int result = calReward(arr[i]);
			if(result>reward)
				reward = result;

		}
		
		
		System.out.println(reward);
		

	}
	
/* 내 코드 */	
//	public static int calReward(int[] arr) {
//		int reward;
//		int cnt=1,num =0;
//		
//		for(int i=0;i<diceCnt-1;i++) {
//			if(arr[i]==arr[i+1]) {
//				num = arr[i];
//				cnt++;
//			}
//		}
//		
//		if(diceCnt == cnt) {//주사위의 눈이 모두 같음
//			reward = 10000+(num*1000);
//		}else if(diceCnt-1 == cnt) {
//			reward = 1000+(num*100);
//		}else {
//			reward = arr[diceCnt-1]*100;
//		}
//		
//		return reward;
//	}

	/* 해답 코드 */
	public static int calReward(int[] arr) {
		int reward;
		int a=arr[0],b=arr[1],c=arr[2];
		
		if(a==b && b==c) {
			reward = 10000+(a*1000);
		}else if(a==b || b==c) {
			reward = 1000+(b*100);
		}else {
			reward = c*100;
		}
		
		return reward;
		
		
	}

}
