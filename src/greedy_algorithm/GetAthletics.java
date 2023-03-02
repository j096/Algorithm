package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GetAthletics {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[][] l = new int[n][2];
		for(int i=0;i<n;i++) {
			l[i][0]=s.nextInt();
			l[i][1]=s.nextInt();
		}
		
		Arrays.sort(l,new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) {
					return o2[1]-o1[1];
				}else {
					return o2[0] - o1[0];
				}
			}
			
		});
		int cnt =0;
		int max =0;
		for(int i=0;i<n;i++) {
			if(l[i][1]>max) {
				cnt += 1;
				max = l[i][1];
			}
				
		}
		
		System.out.println(cnt);
	}

}
