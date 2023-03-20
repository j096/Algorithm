package greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/*
 *1. 공격력 기준으로 오름차순 정렬
 *2. 인풋의 인덱스 기억하기 위해 info class 만들어 arraylist로 만들어준 다음 정렬한다.
 *3. 2중 반복문을 돌려 모두 계산할 수 있지만, 자기보다 약간 애의 최대점수를 누적하여 기억해뒀다가 바로 구하면 시간을 줄일 수 있다.
 *4. 같은 팀의 공격력은 더하면 안되므로, 팀별로 공격력을 저장한다-> HashMap으로 구현
 * 
 * 
 * */
public class BattleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleGameSolution T = new BattleGameSolution();
		System.out.println(Arrays.toString(T.solution(new String[]{"a 20", "b 12", "a 10", "c 11", "e 12"})));
		System.out.println(Arrays.toString(T.solution(new String[]{"a 17", "b 12", "a 10", "c 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(T.solution(new String[]{"b 20", "c 15", "a 200", "b 11", "b 24", "a 25", "b 12"})));
		System.out.println(Arrays.toString(T.solution(new String[]{"a 30", "a 25", "a 25", "b 20", "b 25", "a 25", "b 30"})));
	}

}

class Info implements Comparable<Info>{
	
	public int idx;
	public String team;
	public int power;
	
	Info(int idx, String team, int power){
		this.idx = idx;
		this.team = team;
		this.power = power;
	}

	@Override
	public int compareTo(Info o) {
		
		
		return this.power - o.power;
	}
	
}


class BattleGameSolution {
	public int[] solution(String[] students){
		int n = students.length;
		int[] answer = new int[n];
		
		ArrayList<Info> list = new ArrayList<>();
		
		int idx = 0;
		for(String s : students) {
			String[] inf = s.split(" ");
			
			list.add(new Info(idx++,inf[0],Integer.parseInt(inf[1])));
		}
		
		Collections.sort(list);
		
		HashMap<String,Integer> map = new HashMap<>();
		int cnt =0,j=0;
		for(int i=1;i<list.size();i++) {
			while(j<list.size()) {
				
				if(list.get(i).power>list.get(j).power) {
					cnt+= list.get(j).power;
					map.put(list.get(j).team,map.getOrDefault(list.get(j).team, 0)+list.get(j).power);
					j++;
				}else {
					break;
				}
					
			}
		
			answer[list.get(i).idx] = cnt-map.getOrDefault(list.get(i).team, 0);
		}
		
		return answer;
	}
}