package recursive.dfs;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * 1. n을 10으로 나누는걸 반복해서 숫자 한개씩 배열에 저장(맞음)
 * 2. dfs로 모든 경우의 수 탐색해서 기존 n과 비교하고 min과 비교하여 구한다.(맞음)
 * !! 자리수 배열을 오름차순으로 정렬한 후 최소값이 구해지면 더이상 탐색을 하지 않도록 하여 탐색 시간을 줄인다.!!
 * */
public class MaxNearestNumber {
	
	public static void main(String[] args){
		MaxNearestNumberSolution T = new MaxNearestNumberSolution();
		System.out.println(T.solution(123));
		System.out.println(T.solution(321));
		System.out.println(T.solution(20573));
		System.out.println(T.solution(27711));
		System.out.println(T.solution(54312));
	}

}


class MaxNearestNumberSolution {
	int answer=100000000;
	ArrayList<Integer> digit ;
	int[] visited;
	boolean flag;
	public int solution(int n){
		answer = 100000000;
		flag = false;
		int tmp = n;
		digit = new ArrayList<>();
		while(tmp > 0) {
			digit.add(tmp%10);
			tmp = tmp / 10;
		}
		//정답 코드 추가
		digit.sort((a,b)->a-b);
		//
		visited = new int[digit.size()];
		
		dfs(0,n,0);
		
		return answer==100000000?-1:answer;
	}
		
	
	void dfs(int level,int n, int num){
		//정답코드 추가
		if(flag)
			return;
		//
		if(level == digit.size()) {
			if(num > n && num < answer) {
				answer = num;
				//정답코드 추가
				flag = true;
				//
			}
			return;
		}
		
		
		for(int i=0;i<digit.size();i++) {
			if(visited[i]==0) {
				visited[i]=1;
				dfs(level+1,n,num*10+digit.get(i));
				visited[i]=0;
			}
		}
	}

}