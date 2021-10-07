package DataStructure.CorrectParenthesis;

import java.util.*;

class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(T.solution(str));
    }
 
    public String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x: str.toCharArray()){
            if(x=='(') {
                stack.push(x);
            }else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty())  return "NO";      
        return answer;
    }
}
