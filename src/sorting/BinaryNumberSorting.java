package sorting;

import java.util.Arrays;
import java.util.Comparator;
/*
 * 1. 십진수 숫자와 이진수 1의 갯수를 2중 어레이로 저장한다. (맞음)
 * 2. 이진수의 1의 값을 바로 카운트 한다. (맞음)
 * !!이진수를 구하는 while문 조건을 num>=2 가 아닌 num>0으로 하여 1일 때의 카운트를 한 조건에서만 할 수있도록 수정해야함
 * 1의 갯수를 셀 때에도 if문이 아닌 1 또는 0 그대로 cnt에 더해준다.!!
 * 3. 1 갯수 기준으로 오름차순 하도록 Arrays.sort를 커스터마이징 한다.(맞음)
 * 4. 정렬된 십진수 숫자를 answer에 넣어준다.(맞음)
 * */
public class BinaryNumberSorting {
	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
		System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
		System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
	}
}

class Solution {
	public int[] solution(int[] nums){
		int[] answer = new int[nums.length];
		
		int[][] sort = new int[nums.length][2];
		
		int i=0;
		for(int n : nums) {
			sort[i][0]=n;
			sort[i][1]=getBinaryOneCount(n);
			i++;
		}
		
//		Arrays.sort(sort,new Comparator<int[]>(){
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				if(o1[1]==o2[1])
//					return o1[0]-o2[0];
//				
//				return o1[1]-o2[1];
//			}
//			
//		});
		
		Arrays.sort(sort,(a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
		
		for(int n=0;n<sort.length;n++) {
			answer[n] = sort[n][0];
		}
		
		return answer;
	}
	
	public int getBinaryOneCount(int num) {
		int cnt=0;
		
//		while(num>=2) {
//			if(num%2==1)
//				cnt++;
//			num=num/2;
//		}
//		if(num==1)
//			cnt++;
		
		while(num>0) {
			cnt+= num%2;
			num=num/2;
		}
	
		return cnt;
	}
}