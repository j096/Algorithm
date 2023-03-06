package array_search;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		ArrayList<String> dooris = new ArrayList<String>();
		scanner.nextLine();
		for(int i=1;i<=N;i++) {
			dooris.add(scanner.nextLine());
		}
		
		for(int i=0;i<N;i++) {
			String doori = dooris.get(i).toLowerCase();

			char[] door = doori.toCharArray();
			int length = door.length;
			char[] rood = new char[length];
			int j=0;
			for(j=0;j<Math.ceil(length/2);j++) {
				//뒤집기
				int idx = length-1-j;
				if(door[idx] != door[j]) {
					System.out.println("#"+(i+1)+" NO");
					break;
				}
			}
			if(j==Math.ceil(length/2))
				System.out.println("#"+(i+1)+" YES");
		}
	
		
	}
}
