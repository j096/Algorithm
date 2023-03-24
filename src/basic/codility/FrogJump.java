package basic.codility;

public class FrogJump {
	
	//https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
	
	class Solution {
	    public int solution(int X, int Y, int D) {
	        // Implement your solution here
	    	//Math.ceil 안의 계산 결과를 double로 바꿔줘야 소수점까지 결과로 나와서 올림이 된다.
	        return (int)Math.ceil((double)(Y-X)/D);
	    }
	}
}
