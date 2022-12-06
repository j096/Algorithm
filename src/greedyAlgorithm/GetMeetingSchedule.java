package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GetMeetingSchedule {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] time = new int[n][3];
		for(int i=0;i<n;i++) {
			time[i][0]=s.nextInt();
			time[i][1]=s.nextInt();
			time[i][2]= time[i][1] -time[i][0];
		}
		
//		Arrays.sort(time, new Comparator<int[]>(){
//			@Override
//			public int compare(int[] o1, int[] o2) {
//		    	 if(o1[1] == o2[1]) {
//	                	 return o1[0] - o2[0];
//		    	 }else {
//		    		 return o1[1] - o2[1]; 
//		    	 }
//			}
//		});
		
		Arrays.sort(time,(e1,e2) -> {
			if(e1[1]==e2[1])
//				return Integer.compare(e1[0], e2[0]);
//				또는
				return e1[0]-e2[0];
			else
//				return Integer.compare(e1[1], e2[1]);
				return e1[1]-e2[1];
		});
		
		int cmp =0,total=0;
		for(int i=0;i<n-1;i++) {
			if(time[i][0]>=cmp) {
				total +=1;
				cmp = time[i][1];
			}

		}
		
		System.out.println(total);
		
	}

}
