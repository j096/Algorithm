package greedy_algorithm;

import java.util.LinkedList;
import java.util.Scanner;

public class GetSequenceByReverse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//1~n까지 수열의 역수열
		int[] revSeq = new int[n];
		//수열
		int[] seq = new int[n];
		for(int i=0;i<n;i++) {
			revSeq[i]=sc.nextInt();
		}
		
		//각 1~n까지의 역수열 값만큼 비어있는 칸(0인 칸)을 세서 빈자리면 그대로 수를 넣고, 빈자리가 아니면 다음 빈자리에 넣어준다.
		//1부터 오름차순으로 처리해주기 때문에 앞서 처리한 수는 생각할 필요가 없어 그리디이다.
		for(int i=0;i<n;i++) {
			int cnt = 0;

			for(int j=0;j<n;j++) {
				if(cnt==revSeq[i]) {
					if(seq[j]!= 0)
						continue;
					else {
						seq[j] = i+1;
						break;
					}
						
				}
				if(seq[j]==0)
					cnt++;

			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(seq[i]+" ");
		
		
	}

}
