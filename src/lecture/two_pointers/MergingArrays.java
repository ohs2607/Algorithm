package lecture.two_pointers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 1. 투 포인터
투 포인터란 1차원 배열에서 배열을 가리키고 있는 2개의 포인터를 조작하여, 원하는 값을 얻는 알고리즘

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
오름차순으로 정렬된 배열을 출력합니다.
 */
public class MergingArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }
        for (Integer i : solution(arr1, arr2)) {
            System.out.print(i + " ");
        }
    }

    static Integer[] solution(int[] arr1, int[] arr2){

        // 1. System.arraycopy(원본배열, 시작index, 복사할배열, 복사할배열에 넣을시작위치, 원본에서 복사할 개수)
        /**int len = arr1.length + arr2.length;
        int[] result = new int[len]; // 2개의 배열을 복사해 모두 담을  새로운 배열
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result); // 오름차순(기본) 정렬 (stream을 사용하면 원본은 유지할 수 있음)*/

        // 2. List 사용
        /* Arrays.asList(arr1)로 바로 List가 만들어지지 않는 이유는 int가 기본형이기 떄문.
        처음부터 Integer[] 배열로 만들면 되지만, 그렇지 않은 경우는 boxed를 사용
        boxed는 기본 자료형 값을 해당 기본 자료형의 래퍼(wrapper) 클래스로 변환하는 메서드
        boxed() 메서드는 IntStream을 Stream<Integer>로 변환
        collect 메서드는 Collector 인터페이스를 구현한 객체를 받아서 요소를 수집
        */
        List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());

        // 2-1. list를 합치는 방법  - addAll
        /*list2.addAll(list1);
        Collections.sort(list2);
        // 크기가 0이라는 것은 결과 배열의 크기를 내부에서 자동으로 결정하라는 의미
        Integer[] result = list2.toArray(new Integer[0]);*/

        // 2-1. list를 합치는 방법  - Stream의 concat
        Integer[] result = Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2)
                .boxed()).sorted().collect(Collectors.toList()).toArray(new Integer[0]);

        return result;
    }
}
/**
3
1 3 5
5
2 3 6 7 9
 */