package programmers.lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeToLowercase {

    public static void main(String[] args) throws IOException {
        ChangeToLowercase lower = new ChangeToLowercase();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(lower.solution(str));
    }

    public String solution(String myString){
        String answer = "";

        // 1. 문자 하나씩 소문자로 바꿔서 answer에 넣는 방법
        /*for(char c : myString.toCharArray()){
            answer += Character.isUpperCase(c) ? Character.toLowerCase(c) : c;
        }*/

        // 2. 문자열 전체를 소문자로 바꾸기 (v)
        answer = myString.toLowerCase();

        return answer;
    }
}
