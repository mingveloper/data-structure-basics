```java
import java.util.*;

class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //1
        System.out.println(T.solutionIsLowerCase(str));
        //2
        System.out.println(T.solutionASCII(str));
    }


    //isLowerCase를 이용 
    public String solutionIsLowerCase(String str){
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            else answer+=Character.toLowerCase(x);
        } 
        return answer;
    }

    //아스키코드를 이용
    public String solutionASCII(String str){
        String answer="";
        for(char x : str.toCharArray()){
            String answer = "";
            //대문자는 65~90, 소문자는 97~122 
            //대소문자의 아스키넘버 차이 = 32
            if(x>= 97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32); 
        } 
        return answer;
    }
}
```