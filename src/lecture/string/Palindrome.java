package lecture.string;

/* 회문 문자열 (앞에서 읽을때나 뒤에서 읽을때나 같은 문자열) */

import java.util.Scanner;

/**
 * 문자열이 입력되면 해당 문자열이 회문이면 YES, 아니면 NO 를 return하는 프로그램
 * 회문 검사 시 대소문자 구별 X
 * gooG
 */
public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }

    static String solution(String str){
        String isPalindrome = "NO";

        // 1. 문자열 전체를 뒤집고 비교하기
        String reverse = new StringBuilder(str).reverse().toString();
        if(reverse.equalsIgnoreCase(str)){
            isPalindrome = "YES";
        }

        // 2. 뒤집고 담는거 없이 '절반만' 확인해보기
        /**str = str.toUpperCase(); // 일단 대문자로 변경
        int len = str.length();
        for (int i = 0; i<len / 2; i++){
            if(str.charAt(i) == str.charAt(len-i-1)) isPalindrome = "YES";
        }*/
        return isPalindrome;
    }
}
