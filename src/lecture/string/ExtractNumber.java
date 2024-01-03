package lecture.string;

import java.util.Scanner;

/** 9. 문자와 숫자가 섞여있는 문자열이 주어지면, 그 중 숫자만 추출하고 그 순서대로 자연수를 만듦
 *  g0en2T0s8eSoft -> 208
 */
public class ExtractNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }

    static int solution(String str){
        int result = 0;

        /* 1. StringBuilder에 숫자 누적해서 parseInt로 변환하는 방법 */
        /**StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if(c >= 48 && c <= 57) sb.append(c);
        }
        if(sb.charAt(0) == 0) {
            result = Integer.parseInt(sb.substring(1));
        }
        result = Integer.parseInt(sb.toString());*/

        /* 2. 규칙을 사용해 한번에 누적하기 */
        /**for (char c : str.toCharArray()) {
            if(c >=48 && c <= 57){
                result = result * 10 + (c - 48);
            }
        }*/

        /* 3. Character의 isDigit */
        String answer = "";
        for (char c : str.toCharArray()) {
            if(Character.isDigit(c)) answer += c;
        }
        result = Integer.parseInt(answer);

        return result;
    }
}
