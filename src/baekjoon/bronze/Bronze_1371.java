package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

/*
영어에서는 어떤 글자가 다른 글자보다 많이 쓰인다. 예를 들어, 긴 글에서 약 12.31% 글자는 e이다.
어떤 글이 주어졌을 때, 가장 많이 나온 글자를 출력하는 프로그램을 작성하시오.

첫째 줄에 가장 많이 나온 문자를 출력한다. 여러 개일 경우에는 알파벳 순으로 앞서는 것부터 모두 공백없이 출력한다.
 */
public class Bronze_1371 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int[] alphabet = new int[26];

        // 문제 제출시에는 && !str.isEmpty() 뺴고
        while ((str = br.readLine()) != null && !str.isEmpty()) {

            for (int i = 0; i < str.length(); i++) {
                // A : 65, a : 97, 공백 : 32
                if (str.charAt(i) != ' ') {
                    alphabet[str.charAt(i) - 'a']++;
                }
            }
        }

        int maxNum = IntStream.of(alphabet).max().orElse(0);
        // 배열의 요소들 중 최댓값과 같은 요소들의 자릿수만 찾는다
        /* 위에 max를 구했었지만 다시 최댓값을 구해서 filter에 사용한 이유는
            java: local variables referenced from a lambda expression must be final or effectively final
            람다 표현식에서는 사용 가능한 지역변수라도 이미 값이 한번이상 변경된 지역변수는 못쓴다

            따라서 위에서 max를 구할 경우 while문에서 값이 변경되었기 때문에 새로 구한 maxNum을 사용해야 한다
        */
        IntStream.range(0, alphabet.length)
                .filter(i -> alphabet[i] == maxNum)
                        .forEach(i -> {
                            // i는 index번호이자, 알파벳과 연결된 숫자. 따라서 알파벳을 알려면 문자로 변환하면 된다.
                            char c = (char) (i + 'a');
                            System.out.print(c);
                        });

        // 또 다른 방법으로는 max값을 두고 for문으로 Math.max로 최댓값을 구한다음
        // 다음 for문으로 max값과 일치하는 index를 영문자로 변환한 결과를 출력하면 된다.
    }
}
/*
english is a west germanic
language originating in england
and is the first language for
most people in the united
kingdom the united states
canada australia new zealand
ireland and the anglophone
caribbean it is used
extensively as a second
language and as an official
language throughout the world
especially in common wealth
countries and in many
international organizations

-> a
 */