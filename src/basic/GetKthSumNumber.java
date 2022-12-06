package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class GetKthSumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] cards = new int[n];
		for(int i=0;i<n;i++) {
			cards[i] = sc.nextInt();
		}
		
		HashSet<Integer> result = new HashSet<>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int m=j+1;m<n;m++) {
					result.add(cards[i]+cards[j]+cards[m]);
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>(result);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(k-1));

	}

}
