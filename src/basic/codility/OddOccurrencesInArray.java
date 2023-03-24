package basic.codility;

// you can also use imports, for example:
 import java.util.*;
public class OddOccurrencesInArray {

	//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
	class Solution {
	    public int solution(int[] A) {
	        // Implement your solution here
	        int answer = 0;
	        if(A.length == 1)
	            return A[0];

	        Arrays.sort(A);

	        int i =0;
	        while(i<A.length){
	            if(i==A.length-1){
	                answer=A[i];
	                break;
	            }
	            if(A[i]==A[i+1])
	                i=i+2;
	            else{
	                answer=A[i];
	                break;
	            }
	        }

	        return answer;
	    }
	}
}
