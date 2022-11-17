package recursive;

import java.util.Scanner;

public class GetRecursiveBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		getBinary(N);
		
	}
	
	public static void getBinary(int  num) {
		if(num > 1) {
			getBinary(num/2);
			System.out.print(num%2);
		}else {
			System.out.print(1);
		}
	}

}
