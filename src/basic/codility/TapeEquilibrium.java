package basic.codility;

public class TapeEquilibrium {

	//https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
	
	//시간 복잡도 O(N)을 위해,total 을 먼저 구해두는것이 요점이다.
	//이중 for문으로 구하면 안됨.
	class Solution {
	    public int solution(int[] A) {
	        // Implement your solution here
	        int answer = 20000000;
	        int tot=0;
	        for(int a: A){
	            tot+=a;
	        }

	        int subtot=0;
	        for(int i=0;i<A.length-1;i++){
	            subtot+=A[i];
	            int distance = Math.abs(tot-subtot-subtot);
	            answer = Math.min(distance,answer);
	        }

	        return answer;
	    }
	}
}
