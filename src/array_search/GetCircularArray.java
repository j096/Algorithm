package array_search;

import java.util.Scanner;

public class GetCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[][] = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]= s.nextInt();
			}
		}
		
		int m = s.nextInt();
		int cir[][] = new int[m][3];
		for(int i=0;i<m;i++) {
			for(int j=0;j<3;j++) {
				cir[i][j] = s.nextInt();
			}
		}
		
		//회전 후 배열 구하기
		for(int i=0;i<m;i++) {
			int col = cir[i][0]-1;
			int lr = cir[i][1];
			int num = cir[i][2];
			
			int tmp[] = new int[n];
			if(lr == 0) {
			for(int j=0;j<n;j++) {
					int chRow = j-num;
					while(chRow < 0) {
							chRow = chRow+n;
					}
					tmp[chRow] = arr[col][j];
				}
			}else {
				for(int j=0;j<n;j++) {

					int chRow = j+num;
					while(chRow > n-1) {
						chRow = chRow-n;
					}
					tmp[chRow] = arr[col][j];
				}
			}
			arr[col]= tmp.clone();

		}
			
		//전체 배열 중 모래시계 모양의 값만 구하기
		int st = 0,ed=n,sum=0;
		for(int i=0;i<n;i++) {
			for(int j=st;j<ed;j++) {
				sum+=arr[i][j];
			}
			
			if(i<n/2) {
				st +=1;
				ed -=1;
			}else {
				st -=1;
				ed +=1;
			}
		}
		
		System.out.println(sum);
			
		
	}

}
