package array_search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MixAndSortTwoArray {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = s.nextInt();
		}
		
		n = s.nextInt();
		int[] arr2  = new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]= s.nextInt();
		}
	
		int p1=0,p2=0,p=0;
		int[] arr = new int[arr1.length+arr2.length];
		while(p1<arr1.length && p2<arr2.length) {
			if(arr1[p1]<arr2[p2]) {
				arr[p]=arr1[p1];
				p1++;
				p++;
			}else {
				arr[p]=arr2[p2];
				p2++;
				p++;
			}
		}
		
		if(p1<arr1.length) {
			for(int i=p1;i<arr1.length;i++) {
				arr[p]=arr1[i];
				p++;
			}
		}else if(p2<arr2.length) {
			for(int i=p2;i<arr2.length;i++) {
				arr[p]=arr2[i];
				p++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		
	}

}
