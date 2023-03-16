package array_search;

import java.util.*;
class MaxConsecutiveSequence{
	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{8, 1, 9, 3, 10, 2, 4, 0, 2, 3}));
		System.out.println(T.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3, 3, 3, 3}));
		System.out.println(T.solution(new int[]{-3, -1, -2, 0, 3, 3, 5, 6, 2, 2, 1, 1}));
		System.out.println(T.solution(new int[]{-5, -3, -1, -4, 3, 3, 5, 6, 2, 2, 1, 1, 7}));
	}
}
class Solution {
	
	/*내 코드*/
//	public int solution(int[] nums){
//		int answer = 0,max=0;
//		Arrays.sort(nums);
//		
//		
//		for(int i=0;i<nums.length;i++) {
//			int num = nums[i];
//			answer = 0;
//			for(int j=i+1;j<nums.length;j++) {
//				if(num+1==nums[j]) {
//					answer++;
//					num=nums[j];
//				}
//				
//			}
//			
//			if(max<answer)
//				max=answer;
//		}
//		return max+1;
//	}
	
	/* 정답 코드*/
	/*
	 * 단순 배열이 아닌, HashSet으로 중복을 제거하고
	 * 수열의 시작점을 x-1을 포함하였는지 찾아내어
	 * 시간 복잡도를 줄임
	 * 
	 * */
	public int solution(int[] nums){
		int answer = 0,cnt=0;
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int x : nums) {
			set.add(x);
		}
		
		for(int x:set) {
			cnt++;
			if(set.contains(x-1))	continue;
			cnt = 0;
			while(set.contains(x)) {
				cnt++;
				x++;
			}
			
			answer = Math.max(answer, cnt);
		}

		return answer;
	}


}
