package recursive.dfs;

public class BinaryTreeDfs {
	public static void main(String[] args) {
		DFS(1);
	}
	
	public static int DFS(int n) {
		if(n>7)
			return -1;
		else {
			//전위순회(부->왼->오)
			System.out.println(n);//부
			DFS(n*2);//왼
			DFS(n*2+1);//오
			//중위순회(왼->부->오)
			DFS(n*2);//왼
			System.out.println(n);//부
			DFS(n*2+1);//오
			//후외순회(왼->오->부)
			DFS(n*2);//왼
			DFS(n*2+1);//오
			System.out.println(n);//부

		}
		
		return 0;
			
	}
}
