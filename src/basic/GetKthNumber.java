package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetKthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);		
		int T = scanner.nextInt();
		ArrayList<Integer> out= new ArrayList<Integer>();
		ArrayList<Integer> in= new ArrayList<Integer>();

		for(int i=1;i<=T;i++) {
			int N = scanner.nextInt();
			int s = scanner.nextInt();
			int e = scanner.nextInt();
			int k = scanner.nextInt();
			for(int j=1;j<=N;j++) {
				int a= scanner.nextInt();

				if(j>=s && j<=e) {
					in.add(a);
				}
				
			}
			
			Collections.sort(in);
			out.add(in.get(k-1));
			in.clear();
		}
		
		for(int i=1;i<=T;i++) {
			System.out.println("#"+i+" "+out.get(i-1));
		}
	}

}
