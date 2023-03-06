package binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] nums = new int[N];
		
		for(int i=0;i<N;i++) {
			nums[i]=scanner.nextInt();
		}
		
		//1.정렬
		Arrays.sort(nums);
		//2.이분검색
		int min = 0,max=N-1;
		
//		for(int i=0;i<Math.sqrt(nums.length);i++) {
//			int mid=(min+max)/2;
//			if(nums[mid]==M) {
//				System.out.println(mid+1);
//				break;
//			}else if(nums[mid] > M) {
//				max = mid-1;
//			}else {
//				min = mid+1;
//			}
//		}
		
		while(min<=max) {
			int mid = (min+max)/2;
			if(nums[mid]==M) {
				System.out.println(mid+1);
				break;
			}else if(nums[mid]>M)
				max = mid-1;
			else
				min = mid+1;
		}
	}

}
