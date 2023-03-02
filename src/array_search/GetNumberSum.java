package arraySearch;

import java.util.Scanner;

public class GetNumberSum {

	public static int n,sum,cnt=0;
	public static int[] arr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		sum = s.nextInt();
		
		arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		int lt=0,rt=0;
		int tot=0;
		
		while(true) {
			if(tot < sum) {
				if(rt<n) {
					tot+=arr[rt];
					rt++;
				}else {
					break;
				}
				
			}else if(tot==sum) {
				cnt++;
				tot-=arr[lt];
				lt++;
			}else {
				tot-=arr[lt];
				lt++;
			}
				
		}
		
		System.out.println(cnt);
		
	}

}
