package greedy_algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BoxArrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int min=101,max=-1;
		int[] box = new int[n];
		for(int i=0;i<n;i++) {
			box[i] = s.nextInt();
			if(min>box[i]) {
				min=box[i];
			}else if(max<box[i]) {
				max=box[i];
			}
		}
		
		int m = s.nextInt();
		
		Arrays.sort(box);
		
		for(int i=0;i<m;i++) {
			box[0]+=1;
			box[n-1]-=1;
			Arrays.sort(box);
		}
		
		System.out.println(box[n-1]-box[0]);
		
		
	}

}
