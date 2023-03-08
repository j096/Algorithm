package recursive.dfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RouteCount {
	static int[][] graph;
	static int[] check;
	static int n,m,cnt =0;
	static List path = new LinkedList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new int[n+1][n+1];
		
		for(int i=0;i<m;i++) {
			int v = sc.nextInt();
			int e = sc.nextInt();
			
			graph[v][e] = 1;
		}
		check = new int[n+1];
		path.add(1);
		// 그래프에서 '경로'의 정의는 한 번 방문한 곳은 다시 방문하지 않는다.
		// 따라서 1번 정점에서 다른 정점을 거쳐 다시 1번 정점으로 돌아오지 않도록 미리 방문한 것으로 처리해준다.
		check[1]=1;
		dfs(1);
		
		System.out.println(cnt);
		
	}
	
	
	public static void dfs(int vertex) {
		
		if(vertex == n) {
			cnt++;
			for(int i=0;i<path.size();i++) {
				System.out.print(path.get(i)+" ");
			}
			System.out.println();
		}else {
			for(int i=1;i<=n;i++) {
				if(graph[vertex][i] == 1 && check[i]==0) {
					check[i] = 1;//방문한 곳 제외
					path.add(i);
					dfs(i);
					check[i] = 0;
					path.remove(path.size()-1);
				}
			}
		}
		
	}

}
