package array_search.programmers;

/* https://school.programmers.co.kr/learn/courses/30/lessons/86491 */
public class MinRectangle {
    public int solution(int[][] sizes) {
        int maxw=0,maxh=0;
        //명함을 가로가 세로보다 길도록 눕혀준다.
        for(int i=0;i<sizes.length;i++){
            int tmp;
            if(sizes[i][0]<sizes[i][1]){
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
        }
        // 명함 가로의 최댓값과 세로의 최대값을 구해준다.
        for(int i=0;i<sizes.length;i++){
            
            if(sizes[i][0]>maxw)
                maxw = sizes[i][0];
            
            if(sizes[i][1]>maxh)
                maxh = sizes[i][1];            
            
        }
        return maxw*maxh;
    }
}
