```java
import java.util.*;

class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        //1
        System.out.println(T.solutionLength(str));
        //2
        System.out.println(T.solutionStringBuilder(str));
    }


    //1. isLowerCase를 이용 
    public String solutionLength(String str){
        String answer="YES";
        int len = str.length();
        for(int i=0; i<len/2; i++){
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO"
        }
        return answer;
    }

    //2. StringBuilder를 이용
    public String solutionStringBuilder(String str){
        String answer="";
       Sring answer="NO";
       String tmp = new StrigBuilder(str).reverse().toString();

       //equals는 대소문자 구별함.
       if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }
}
```