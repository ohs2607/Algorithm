package practice.sorting;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        Bubble b = new Bubble();
        int[] arr = {5, 9, 3, 1, 2, 8, 4, 6, 7};

        System.out.println(Arrays.toString(b.bubbleSort(arr)));
    }

    public int[] bubbleSort(int[] arr){
        int temp; // 값을 바꾸기 위해 필요한 비어있는 변수
        boolean continuous = true; // 모든 요소들을 정렬하기 위해 지속을 결정

        while(continuous){
            continuous = false;

            /* 제일 마지막 요소는 비교가 필요 없기 때문에 범위에서 제외*/
            for (int i=0; i<arr.length - 1; i++){

                // 1. 바로 옆의 요소와 비교한다
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    continuous = true;
                }
            }
        }
        return arr;
    }
}
