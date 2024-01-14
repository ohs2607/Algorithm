package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성 */
// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력, 대문자로 출력
// 대문자와 소문자를 구분하지 않는다.
// Mississipi
public class Bronze_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        Map<Character, Integer> word = new HashMap<>();
        
        for (char c : str.toLowerCase().toCharArray()) {
            word.put(c, word.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for (Map.Entry<Character, Integer> et : word.entrySet()) {
            if (et.getValue() > max){
                max = et.getValue();
                result = String.valueOf(et.getKey()).toUpperCase();
            } else if (et.getValue() == max){
                result = "?";
            }
        }
        System.out.println(result);
    }

}
