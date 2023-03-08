package recursive.dfs.programmers;

import java.awt.Point;

/* https://school.programmers.co.kr/learn/courses/30/lessons/1844 */
// BFS 로 푸는 문제라 효율성이 떨어짐
// 정확도 47% 이기 때문에 소스 수정 필요
public class GameMapMinRoute {

    Point[] move = {new Point(1,0),new Point(0,1),new Point(-1,0),new Point(0,-1)};
    int min = 100000,n,m;
    public int solution(int[][] maps) {
        m = maps[0].length;
        n = maps.length;
        
        dfs(maps,1,0,0);
                
        return min == 100000 ? -1 : min;
    }
    
    public void dfs(int[][] maps, int cnt,int i, int j){
        
        if(i == n-1 && j == m-1){
            if(cnt < min)
                min = cnt;  
        }else{
            for(int k=0;k<move.length;k++){
                int x = move[k].x;
                int y = move[k].y;
                if(i+x>=0 && i+x<=n-1 && j+y>=0 && j+y<=m-1){
                    if(maps[i+x][j+y] == 1){
                        maps[i+x][j+y] = 0;
                        cnt = cnt+1;
                        dfs(maps,cnt,i+x,j+y);
                    }
                }
            }
        }
    }
	
}
