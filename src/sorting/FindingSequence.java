package sorting;

import java.util.Arrays;
import java.util.HashMap;
/*
 * 1. 오름차순 정렬한다.
 * 2. 처음부터 끝까지 순차로 탐색하며 2배의 수가 있는지 확인
 * 3. 있다면 기존 수열의 수이므로 선택
 * 
 * 해를 구하는 로직만 생각했을 때, 시간 복잡도를 줄이기 위한 정답:
 * 1. 오름차순 정렬한다.
 * 2. 각 숫자별 빈도수를 저장한다.
 * 3. nums.length 만큼만 반복문 돌아 빈도수 체크하며 넣어준다.
 * !!가장 작은 숫자는 원래 수이다!!
 * */
public class FindingSequence {
	public static void main(String[] args){
		FindingSequenceSolution T = new FindingSequenceSolution();
		System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
		System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
		System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
	}
}


class FindingSequenceSolution {
	public int[] solution(int[] nums){
		int[] answer = new int[nums.length / 2];
	
		/*
		 * //1 Arrays.sort(nums);
		 * 
		 * //2 int idx = 0; for(int i=0;i<nums.length-1;i++) { for(int
		 * j=i+1;j<nums.length;j++) { //3 if(nums[i]*2 == nums[j]){
		 * answer[idx++]=nums[i]; break; } } }
		 */
		
		//정답 코드
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(nums);
		for(int n : nums) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		
		int idx= 0;
		for(int n: nums) {
			if(map.get(n)==0) continue;
			
			answer[idx++] = n;
			
			map.replace(n, map.get(n)-1);
			map.replace(n*2, map.get(n*2)-1);
		}
		
		return answer;
	}


}