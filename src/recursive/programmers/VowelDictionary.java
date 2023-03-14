package recursive.programmers;

/* https://school.programmers.co.kr/learn/courses/30/lessons/84512?language=java */
/* 재귀함수를 이용해 완전 탐색을 구현해야한다. (dfs와 유사)*/
public class VowelDictionary {

    String[] vowel = {"A","E","I","O","U"};
    int answer = 0, cnt=0;
    public int solution(String word) {
        dfs(word,"",1);
        return answer;
    }
    
    public void dfs(String word, String ex, int idx){      
        
        if(ex.equals(word)){
            answer = cnt;
            return;
        }
        
        if(idx == 6)
            return;          
        
        for(int i=0;i<vowel.length;i++){
            cnt++;
            dfs(word,ex+vowel[i],idx+1);
        }
    }
}
