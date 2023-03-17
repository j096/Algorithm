package greedy_algorithm;

import java.util.Arrays;

/*
 * 1. 오름차순 정렬
 * 2. 가장 무거운 무게와 가장 가벼운 무게순으로 조합해서 카운트(한번에 2개이상 들수있으나 모든 무게는 2이상 5이하이므로 최대 2개까지밖에 못든다.)
 * !!인풋값의 조건을 잘 확인하자!! * */
public class MovingCount {
	public static void main(String[] args){
		MovingCountSolution T = new MovingCountSolution();
		System.out.println(T.solution(new int[]{2, 5, 3, 4, 2, 3}));
		System.out.println(T.solution(new int[]{2, 3, 4, 5}));
		System.out.println(T.solution(new int[]{3, 3, 3, 3, 3}));
	}
}


class MovingCountSolution {
	
	public int solution(int[] nums){
		int answer = 0;
		
		Arrays.sort(nums);
		
		int left =0, right= nums.length-1,sum=0;
		
		while(left<=right) {
			if(nums[left]+nums[right]<=5) {
				right--;
				left++;
				answer++;
			}else {
				answer++;
				right--;
			}
			
		}
		
		return answer;
		
		
	}
	
}