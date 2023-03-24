package basic.codility;

public class PermMissingElem {

	//https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/


	class Solution {
		
		//O(N) or O(N * log(N))
	    public int solution(int[] A) {
	        // Implement your solution here
	        int answer = 0;
	        int N = A.length;
	        int[] check = new int[N+2];
	        check[0]=1;
	        if(N == 0)
	            return 1;
	            
	        for(int i=0;i<A.length;i++){
	            check[A[i]]=1;
	        }

	        for(int i=1;i<check.length;i++){
	            if(check[i]==0)
	                answer=i;
	        }



	        return answer;
	    }
	}
}
