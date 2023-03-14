package basic.programmers;

import java.util.ArrayList;
import java.util.Stack;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12906 */
/* 정답이 배열이지만 크기가 가변일 때 , 리스트에 넣어준 다음 배열을 다시 초기화 하여 넣어주는 방법을 위한 알고리즘*/
public class NoDupNum {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> tmp = new ArrayList<>();
        
        int pre = -1;
        for(int num : arr){
            if(num != pre){
                tmp.add(num);
            }
            pre = num;
            
            
        }
        answer = new int[tmp.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=tmp.get(i);
        }
        

        return answer;
    }
}
