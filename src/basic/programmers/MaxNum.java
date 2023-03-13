package basic.programmers;

import java.util.Arrays;
import java.util.Comparator;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42746 */
/* 100, 10 과 같은 숫자들을 문자열로 바꿔 그대로 합쳐 비교하는 것이 관건 */
public class MaxNum {
    public String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            nums[i]=String.valueOf(numbers[i]);
        }
        
        
		Arrays.sort(nums,new Comparator<String>(){
            @Override
			public int compare(String o1, String o2) {
                String a1 = o1+o2;
                String b1 = o2+o1;
                int a = Integer.parseInt(a1);
                int b = Integer.parseInt(b1);
                return b-a;
				
			}
			
		});

        for(int i=0;i<nums.length;i++){
        
             answer += nums[i];
        }
        
        if(answer.charAt(0)=='0')
            return "0";

        return answer;
    }
}
