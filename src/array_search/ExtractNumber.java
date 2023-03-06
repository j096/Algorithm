package array_search;

import java.util.Scanner;

public class ExtractNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char[] word = scanner.nextLine().toCharArray();
		int number=0;
		for(char w:word) {
			if(Character.isDigit(w))
				number=number*10+Character.getNumericValue(w);
		}
		int cnt =0;
		for(int i=1;i<=Math.sqrt(number);i++) {
			if(number%i == 0)
				cnt = cnt+1;
		}
		System.out.println(number);
		System.out.println(cnt*2);
		
	}

}
