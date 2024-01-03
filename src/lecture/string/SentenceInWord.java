package lecture.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/** 문장 속에서 가장 길이가 긴 단어 출력
 *  it is time to study -> study
 */
public class SentenceInWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        System.out.println(resolve(sentence));
    }

    static public String resolve(String sentence){
        String result = "";
        int wordLength = 0;

        /* 1. StringTokenizer로 문자 분리 */
        /**StringTokenizer st = new StringTokenizer(sentence);
        while (st.hasMoreTokens()){
            String word = st.nextToken();

            if(wordLength < word.length()){
                wordLength = word.length();
                result = word;
            }
        }*/

        /* 2. indexOf 사용 */
        int pos;
        while((pos = sentence.indexOf(' ')) != -1){
            // 띄어쓰기가 있으면 해당 위치를 반환, 발견하지 못하면 -1을 반환
            // it is time to study 라면 첫번째 pos는 2

            // 발견하면 그 이후부터로 다시 잘라서 확인해야해
            String tmp = sentence.substring(0, pos);

            if(wordLength < tmp.length()){
                wordLength = tmp.length();
                result = tmp;
            }
            sentence = sentence.substring(pos+1);
        }
        // 마지막 단어가 올때에는 공백이 없게돼. 따라서 while문을 통과하지 못함
        if(wordLength < sentence.length()) result = sentence;

        return result;
    }


}
