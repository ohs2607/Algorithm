package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 길이가 짧은 순서부터, 길이가 같으면 사전순, 중복은 제거 */
/* TreeSet 사용 */
public class SortWord_after {
// 코드가 더 깔끔해짐
// 문자열 배열을 List로 바꾸지 않았기에 중복제거를 TreeSet으로 입력 순간에 한꺼번에 처리
// Arrays.sort를 사용하지 않고,
// TreeSet의 생성자의 파라미터로 Comparator를 생성해서 compare 오버라이딩

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 입력받을 때 중복 제거 + 정렬 준비 (생성자의 파라미터에 Comparator 넣어주기)
        // compare는 추상메서드이므로 재정의가 필요함. 따라서 Comparator 객체를 생성해 줘야해
        Set<String> words = new TreeSet<>(new Comparator<String>() {

            // 이제 추상메서드인 compare 구현하기
            @Override
            public int compare(String o1, String o2) {
                // 반환 타입이 int인데 비교 후 결과를 음수, 양수로 return 해주기 때문
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        for (int i=0; i<n; i++){
            words.add(br.readLine());
        }

        for (String word : words) {
            System.out.println(word);
        }

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