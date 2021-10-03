


<h2>아나그램(Hash)</h4>

<h3>-설명</h3>

<h4>Anagram이란 두 문자열이 알파벳의 나열 순서가 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 한다.
예를 들면 AbaAeCe와 
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
