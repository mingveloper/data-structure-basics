# Selection Sort


<h2>선택 정렬이란?</h2>

<h4>전체 원소들 중에서 기준위치에 맞는 원소를 선택하여 자리를 교환하는 방식</h6>

 1. 전체 원소 중에서 가장 작은 값을 찾아 선택하여 첫 번째 원소의 자리와 교환.
 2. 1의 과정을 수행 후 그 다음 작은 값을 찾아 두번째 원소의 자리와 교환한다. 
 3. 1과 2의 과정을 반복하여 정렬시킨다. 

### 선택 정렬 예시(Java)

```java
public class SelectionSort {

    public static void selectionSort(int[] arr) {
        final int length = arr.length;
        for (int i = 0; i < length; i++) {
            int min = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (min == i) {
                continue;
            }

            arr[min] = arr[min] + arr[i];
            arr[i] = arr[min] - arr[i];
            arr[min] = arr[min] - arr[i];
        }
    }
  
}
```

### 테스트

```java
public static void main(String[] args) {
    int[] arr = new int[]{2,7,11,4,5,8};
    SelectionSort.selectionSort(arr);
    for(int i : arr) { 
        System.out.print(i+" ");
    }
}
```

### 결과

```java
2 4 5 7 8 11
```



### Reference 
* https://github.com/GimunLee/tech-refrigerator/blob/master/Algorithm/%EC%84%A0%ED%83%9D%20%EC%A0%95%EB%A0%AC%20(Selection%20Sort).md#reference--additional-resources

* https://medium.com/@joongwon/%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B8%B0%EC%B4%88-805391cb088e