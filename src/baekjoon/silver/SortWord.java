package baekjoon.silver;

import java.util.*;

/* 길이가 짧은 순서부터, 길이가 같으면 사전순, 중복은 제거 */
public class SortWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] wArr = new String[num];

        for (int i = 0; i < num; i++) {
            wArr[i] = sc.nextLine();
        }
        System.out.println(solution(num, wArr));
    }

    static List<String> solution(int cnt, String[] wArr) {
        List<String> result = new ArrayList<>();
        boolean continuous = true;

        // 1. 중복 제거
        for (int i = 0; i < cnt; i++) {
            if (!result.contains(wArr[i])) result.add(wArr[i]);
        }

        // 2. 길이가 짧은 단어 순서대로 정렬
        while (continuous) {
            continuous = false;

            for (int i = 0; i < result.size() - 1; i++) {

                if (result.get(i).length() > result.get(i + 1).length()) {
                    String tmp = result.get(i);
                    result.set(i, result.get(i + 1));
                    result.set(i + 1, tmp);

                    continuous = true;
                }
            }
        }


        for (int i = 0; i < result.size() - 1; i++) {

            if (result.get(i).length() == result.get(i + 1).length()) {
                List<String> temp = Arrays.asList(result.get(i), result.get(i + 1));
                temp.sort(null);

                result.set(i, temp.get(0));
                result.set(i + 1, temp.get(1));
            }
        }
        return result;
    }


}
/**
 * 13
 * but
 * i
 * wont
 * hesitate
 * no
 * more
 * no
 * more
 * it
 * cannot
 * wait
 * im
 * yours
 */