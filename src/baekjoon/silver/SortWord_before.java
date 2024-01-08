package baekjoon.silver;

import java.util.*;

/* 길이가 짧은 순서부터, 길이가 같으면 사전순, 중복은 제거 */
public class SortWord_before {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] wArr = new String[num];

        for (int i = 0; i < num; i++) {
            wArr[i] = sc.nextLine();
        }
        for (String str : solution(num, wArr)) {
            System.out.println(str);
        }
    }

    static Set<String> solution(int cnt, String[] wArr) {
        /* sort를 재정의한다 */
        /**
         * 파라미터가 1개인 sort는 Comparator를 default로 정렬해왔던것. 정수의 경우에는 문제 없지만
         * 문자열의 경우에는 Comparator 재정의가 필요하다.
         * 따라서 2번쨰 파라미터로 Comparator 객체를 생성해서 넘겨준다
         */

        /* 1. 순서대로 정렬 */
        Arrays.sort(wArr, new Comparator<String>() {
            /* Comparator의 메서드 중 compare 오버라이딩 - 재정의 */
            @Override
            public int compare(String s1, String s2) {
                // 반환 값이 int인데, 왜냐면 비교 후 결과를 음수, 양수로 판단해서 정렬하기 떄문이다
                // 단순 길이 비교로 정렬과 & 길이가 같을 경우 사전순서로 정렬도 있기에 조건을 준다
                if (s1.length() == s2.length()){
                    // 길이가 같다면 사전순서로 정렬해야 한다.
                    return s1.compareTo(s2);
                } else {
                    // 양수가 나온다면 s1이 더 길기 때문에 s1과 s2의 자리가 바뀌게 된다
                    return s1.length() - s2.length();
                }
            }
        });

        /* 2. 중복 제거  */
        // 2-1. 배열을 List에 옮겨 닮기 (contains로 존재를 확인하며 담는다 - 비효율)
        List<String> result = new ArrayList<>();
        for (String str : wArr) {
            if (!result.contains(str)) result.add(str);
        }

        // 2-2. 중복을 허용하지 않으면서 들어온 순서를 유지하는 LinkedHashSet 사용
        Set<String> resultSet = new LinkedHashSet<>(List.of(wArr));

        return resultSet;
    }


}
/**
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
 */