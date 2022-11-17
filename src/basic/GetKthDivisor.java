package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GetKthDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//N의 약수 중 K번째 작은 수 구하기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		int k;
		int cnt = 0;
		ArrayList<Integer> divisor = new ArrayList<Integer>();
		try {
			System.out.print("n:");
			n = Integer.parseInt(br.readLine());
			System.out.print("k:");
			k = Integer.parseInt(br.readLine());
			//1. 약수 구하기
			for(int i=1;i<=n;i++) {
				if(n%i == 0)
					cnt = cnt+1;
				if(k==cnt) {
					System.out.println(i);
					cnt = -1;
					break;
				}
			}
			if(cnt != -1)
				System.out.println("-1");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
