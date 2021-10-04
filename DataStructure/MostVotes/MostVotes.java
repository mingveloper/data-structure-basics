package DataStructure.MostVotes;

import java.util.*;

class Main {

    public static void main(String[] args){
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        System.out.println(T.solution(n,str));
    }
 
    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            //getOrDefault(key, defaultValue);
            //key가 존재하지 않을경우 디폴트 값을 지정.
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        int max=Integer.MIN_VALUE;
        for (char key: map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }
        }
        return answer;
    }
}
