package lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 3
 good
 Time
 Big

 doog
 emiT
 giB
 */
public class ReverseWord {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] wordArr = new String[num];

        for (int i = 0; i<num; i++){
            wordArr[i] = br.readLine();
        }

        for (String word : solution(wordArr)){
            System.out.println(word);
        }
    }

    static List<String> solution(String[] wordArr){
        // 뒤집어진 단어가 담길 결과 List
        List<String> wordList = new ArrayList<>();

        for (String str : wordArr) {
            // reverse 메서드를 사용하기 위한 StringBuilder 객체 생성
            // reverse 로 해당 단어를 뒤집고, toString을 사용해 String 변수에 담는다
            String result = new StringBuilder(str).reverse().toString();

            // 해당 변수를 List객체에 추가
            wordList.add(result);
        }
        return wordList;
    }
}
