package basic.codility;

public class BinaryGap {

	//https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
	
}

class Solution {
    public int solution(int N) {
        // Implement your solution here
        String binary = "";
        int answer=0,cnt=0;
        while(N>0){
            if(N<2)
                binary = N + binary;
            else
                binary = N%2 + binary;

            N=N/2;
        }

        char[] nums = binary.toCharArray();

        for(int i=0;i<nums.length;i++){
            if(nums[i]=='1'){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]=='1'){
                        cnt = j-i-1;
                        answer = Math.max(cnt,answer);
                        i=j;
                    }

                }
            }
        }


        return answer;
    }
}
