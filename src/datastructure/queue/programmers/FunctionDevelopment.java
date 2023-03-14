package datastructure.queue.programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/* https://school.programmers.co.kr/learn/courses/30/lessons/42586 */
public class FunctionDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> t = new ArrayList<>();
        
        for(int i=0;i<progresses.length;i++){
            int left = 0;
            if((100-progresses[i])%speeds[i]!=0) // 남은 완료일 수 올림처리(마지막 테스트 케이스 틀려서 수정한 부분)
                left = ((100-progresses[i])/speeds[i])+1;
            else
                left = (100-progresses[i])/speeds[i];
            q.add(left);
        }

        for(int i=1;i<=100;i++){
            int cnt =0;
        
            while(!q.isEmpty() && q.peek()<i){
                q.poll();
                cnt++;
            }
            
            if(cnt > 0)
                t.add(cnt);
        }
        
        answer = new int[t.size()];
        
        for(int i=0;i<t.size();i++){
            answer[i]=t.get(i);
        }
        
        
        return answer;
    }
}
