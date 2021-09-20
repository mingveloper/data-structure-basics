


<h2>문자 찾기</h4>

<h3>-설명</h3>

<h4>한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
<br/><br/>
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
</h4>

<br/>

<h3>-입력</h3>

<h4>첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
<br/><br/>
대소문자를 구분하지 않고 .문자열의 길이는 100을 넘지 않습니다.
<br/>
문자열은 영어 알파벳으로만 구성되어 있습니다.
<br/><br/>

예시입력 ) 
```java
Chicken
c
```
</h4>

<br/>
<h3>-출력</h3>

<h4>첫 줄에 해당 문자의 개수를 출력한다</h4>
<br/>
예시출력 ) 
<br/>

```java
3
```

<br/>

```java

class Main{

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        char c=kb.next().charAt(0);

        System.out.print(T.solution(str, c));
    }

    public int solution(String str, char t){
        int answer=0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
        
        //index
        for(int i=0; i<str.length(); i++){ 
            if(str.charAt(i)==t) answer++;
        }

        //forEach
        for(char x: str.toCharArray()){
            if(x==t) answer++;
        }

        return answer;
    }
}

```
