package greedy_algorithm.programmers;

import java.util.Arrays;

public class SportsWear {
	
	/* https://school.programmers.co.kr/learn/courses/30/lessons/42862 */
	
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int st = 0;
        for(int i=0;i<lost.length;i++){
            for(int j=st;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    reserve[j]=-1;
                    lost[i]=-1;
                    st=j;
                }
            }
        }
        
        
        answer = n-lost.length;

        st = 0;
        for(int i=0;i<lost.length;i++){
            for(int j=st;j<reserve.length;j++){
                if(lost[i]<=reserve[j]+1 && lost[i]>=reserve[j]-1){//reserve-1<=lost<=reserve+1
                    answer++;
                    st = j+1;
                    break;
                }
            }
        }
        
        return answer;
    }

}
