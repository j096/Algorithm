package greedy_algorithm;

import java.util.Arrays;

/*1. 가장 무거운 사람과 가장 가벼운 사람이 한쌍이 되어 탄다.(맞음)
 * 2. 오름차순 정렬을 한다.(맞음)
 * ----------------------------------------------------
 * !!가장 무거운 사람과 가장 가벼운 사람을 탐색할 때 left, right 인덱스를 주어서 left<=right 조건동안 반복하도록 한다.!!*/
public class Titanic2 {
	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[]{90, 50, 70, 100, 60}, 140));
		System.out.println(T.solution(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 100));
		System.out.println(T.solution(new int[]{68, 72, 30, 105, 55, 115, 36, 67, 119, 111, 95, 24, 25, 80, 55, 85, 75, 83, 21, 81}, 120));
	}
}
class Solution {
	public int solution(int[] nums, int m){
		int answer = 0;
		Arrays.sort(nums);
		
//		int st = nums.length-1;
//		for(int i=0;i<=st;i++) {
//			for(int j=st;j>=0;j--) {
//				if(nums[i]+nums[j]<=m) {
//					answer++;
//					st--;
//					break;
//				}else {
//					answer++;
//					st--;
//				}
//			}
//		}
		
		int left=0,right=nums.length-1;
		
		while(left<=right) {//left=right이라는 것은 혼자 남았으며, 혼자 타야함
			if(nums[left]+nums[right]<=m) {
				answer++;
				left++;
				right--;
			}else {//무거운 사람은 혼자 타고, 가벼운 사람은 같이 탈 사람을 다시 찾아야함
				answer++;
				right--;
			}
		}
		
		return answer;
	}
}