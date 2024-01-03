package lecture.string;

// 12. 암호
// 알파벳 대문자로 구성된 비밀편지
// 현수와 영희가 서로 약속한 암호로 구성됨
// 알파벳 한 문자마자 # 또는 * 이 7개로 구성되어있음
// 만약 현수가 #*****# 이렇게 구성된 문자를 보내면 영희는 약속한 규칙대로 해석하는데
// 해당 일곱자리의 이진수로 변경. #은 이진수의 1로, *이진수의 0으로 변환.
// 결과는 1000001
// 그 다음 바뀐 이진수를 십진수화함 -> 65
// 65는 아스키코드로 대문자 A

import java.util.Scanner;

/**
#****###**#####**#####**##**

 #****## --> 'C'
 #**#### --> 'O'
 #**#### --> 'O'
 #**##** --> 'L'
 최종 -> COOL
 */
/* 2진수를 -> 10진수로
* public static int parseInt(String binaryNumber, int radix) */
public class Encrypt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        System.out.println(solution(cnt, sc.next()));
    }

    static String solution(int cnt, String str){
        // 전체 개수는 cnt * 7

        /* 1. 전체를 이진수로 변환해 담아두고 7자리씩 잘라서 새로운 곳에 넣기 */
        /**String answer = "";
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if(c == '#') answer += 1;
            else if(c == '*') answer += 0;
        }
        // 여기까지 1과 0으로 변환은 했는데 이제 일곱자리로 잘라야해
        for (int i=0; i<cnt*7 ; i+=7){
            sb.append((char) Integer.parseInt(answer.substring(i, i + 7), 2));
        }
        return sb.toString();*/

        /* 2. 한번에 자르고 담기 */
        String answer = "";
        for (int i=0; i<cnt; i++){
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            answer += (char)Integer.parseInt(temp, 2);

            str = str.substring(7); // 앞에 처리한 index는 잘라내고 새로
        }
        return answer;
    }
}
