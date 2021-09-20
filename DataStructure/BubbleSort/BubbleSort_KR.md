# Bubble Sort

<h2>버블 정렬이란?</h2>

<h4>인접한 두 항목의 값을 비교해서 일정한 기준을 만족하면 서로의 값을 교환하여 정렬하는 방식</h4>

 1. 배열을 순차탐색하여 i와 i+1번째 요소를 비교하여 큰 것을 뒤로 이동시킨다.
 2. 1과정의 결과는 가장 큰 수가 배열 마지막에 위치하게 된다.
 3. for문은 배열의 length -i 까지만 탐색

### 버블정렬 예시(Java)

```java
public static void bubbleSort(int[] arr) {
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0 ; j < arr.length - i - 1 ; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
```

### 테스트

```java
public static void main(String[] args) {
    int[] arr = new int[]{2,7,6,4,1,8};
    Sort.bubbleSort(arr);
    for(int i : arr) { 
        System.out.print(i+" ");
    }
}
```

### 결과

```java
1 2 4 6 7 8
```

### Reference 

* https://github.com/GimunLee/tech-refrigerator/blob/master/Algorithm/%EA%B1%B0%ED%92%88%20%EC%A0%95%EB%A0%AC%20(Bubble%20Sort).md#%EA%B1%B0%ED%92%88-%EC%A0%95%EB%A0%AC-bubble-sort

* https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html