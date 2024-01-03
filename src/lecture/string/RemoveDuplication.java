package lecture.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 중복된 문자 제거 */
// ksekkset -> kset
public class RemoveDuplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    static String solution(String str){
        // 1. 새로운 공간에 넣고 List의 get으로 contains 확인 후 중복 없이 담기
        /**List<Character> chList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toLowerCase().toCharArray()) {
            if(!chList.contains(c)){
                chList.add(c);
                sb.append(c);
            }
        }
        return sb.toString();*/

        // 2. indexOf 비교
        String result = "";
        for (int i=0; i<str.length(); i++){
            if(i == str.indexOf(str.charAt(i))) result +=str.charAt(i);
        }
        return result;

    }
}
