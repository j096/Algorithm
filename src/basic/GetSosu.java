package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetSosu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		int T = scanner.nextInt();
		int[] num = new int[T];
		int cnt=0;
		for(int i=2;i<T;i++) {
			if(num[i]==0) {
				cnt+=1;
				for(int j=i;j<T;j=j+i) {
					num[j]=1;
				}
			}
		}
		
		System.out.print(cnt);
	}
	

}
