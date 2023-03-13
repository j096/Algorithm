package recursive.dfs.programmers;


/* https://school.programmers.co.kr/learn/courses/30/lessons/87946 */
/*
 * 모든 경우의 수를 dfs 방식으로 탐색하는 것이 중요
 * */
public class Fatigue {
	
    int  answer=-1;
    int[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new int[dungeons.length];
        dfs(k,dungeons,0);
        
        return answer;
    }
    
    void dfs(int k, int[][] dungeons, int cnt){        
        for(int i=0;i<dungeons.length;i++){
            if(dungeons[i][0]<=k && visited[i]==0){
                visited[i]=1;
                dfs(k-dungeons[i][1],dungeons,cnt+1);
                visited[i]=0;
            }
        }
        
        if(cnt > answer)
            answer = cnt;
    }

}
