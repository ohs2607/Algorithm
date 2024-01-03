package lecture.string;

import java.util.Scanner;

/** 회문 문자열 - 2
 * found7, time: study; Yduts; emit, 7Dnuof
 * 알파벳만 비교하고, 숫자나 특수문자는 비교대상에서 제외한다
 */
public class ValidPalindromes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }

    static String solution(String str){
        String isPalindrome = "NO";

        // 알파벳만 모아서 reverse 후에 equal 비교
        // replaceAll - 정규식 사용 (대문자만 제외하고 모두 없앨것)
        // 대문자가 아니면 (꺽새가 부정), 두번째 param은 바꿀 문자
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String reverse = new StringBuilder(str).reverse().toString();
        if(reverse.equals(str)) isPalindrome = "YES";

        return isPalindrome;
    }
}
