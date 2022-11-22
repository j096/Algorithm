package dataStructure.hash;

import java.util.HashMap;
import java.util.Scanner;

public class FindWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		HashMap<String,Integer> dic = new HashMap<>(n);
		s.nextLine();
		for(int i=0;i<n;i++) {
			String word = s.nextLine();
			dic.put(word,0);
		}
		
		for(int i=0;i<n-1;i++) {
			String word = s.nextLine();
			if(dic.containsKey(word))
				dic.replace(word, 1);
		}
		

		for(String w : dic.keySet()) {
			if(dic.get(w)==0)
				System.out.println(w);
		}
		
	}	

}
