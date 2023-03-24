package basic.codility;

public class CyclicRotation {
	
//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
	

class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int[] answer = new int[A.length];
        //A.length < K 일때 고려
        int n = K%A.length;

        for(int i=0;i<A.length;i++){
            int idx =i+n;

            if(idx>=A.length)
                idx = idx-A.length;

            answer[idx]=A[i];

        }

        return answer;

    }
}

}

