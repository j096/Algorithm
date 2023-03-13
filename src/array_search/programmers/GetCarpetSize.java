package array_search.programmers;


/* https://school.programmers.co.kr/learn/courses/30/lessons/42842 */
public class GetCarpetSize {
	
    public int[] solution(int brown, int yellow) {
        int[] result = {0,0};
     //   n*m = brown+yellow;
   //     yellow = (n-2)*(m-2);
        
        for(int n=3;n<2500;n++){
            for(int m=1;m<=n;m++){
                if(n*m == brown+yellow && (n-2)*(m-2)==yellow){
                    result[0]=n;
                    result[1]=m;
                    
                    break;
                        
                }
            }
        }
        
        System.out.println(result[0]+" "+result[1]);
        
        return result;
        
    }

}
