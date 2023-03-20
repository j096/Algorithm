package datastructure.stack;

import java.util.Stack;

/*
 * 1. 인풋 순서대로 stack에 넣기
 * 2. ')' 만나면 숫자 만날때까지 (x) 숫자 없는 경우도 있으므로 '(' 만날때까지 pop해서 꺼낸순서 반대로 저장
 * 3. 숫자만나면 저장한 문자열  숫자만큼 반복해서 저장
 * 
 * !! 기본 로직은 맞으나 중간에 압축이 풀린 결과를 다시 스택에 저장하여 선입선출로 나중에 한번에 꺼내야 한다!!
 * */
public class Unzip {
	public static void main(String[] args){
		UnzipSolution T = new UnzipSolution();
		System.out.println(T.solution("3(a2(b))ef"));
		System.out.println(T.solution("2(ab)k3(bc)"));
		System.out.println(T.solution("2(ab3((cd)))"));
		System.out.println(T.solution("2(2(ab)3(2(ac)))"));
		System.out.println(T.solution("3(ab2(sg))"));
	}
}

class UnzipSolution{
	public String solution(String s){
		String answer = "";
		Stack<String> st = new Stack<>();
		
		for(char a : s.toCharArray()) {
			if(a==')') {
				int num = 0;
				String code="";
				while(!st.isEmpty()) {
					String b = st.pop();
					if(b.equals("(")) {
						if(Character.isDigit(st.peek().charAt(0))){
							num = Integer.parseInt(st.pop());
						}else {
							num = 1;
						}
						
						String tmp = code;
						for(int i=0;i<num-1;i++) {
							code = code+tmp;
						}
						st.push(code);//이 부분이 빠졌음
						break;
						
					}else {
						code = b+code;
					}
				}
				
			}else {
				st.push(a+"");
			}
		}
		
		//순차적으로 하는 스택에서 빼는 부분도 필요
		for(String a: st) {
			answer = answer+a;
		}
		
		
		return answer;
	}
	
	
}
