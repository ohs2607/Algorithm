package lecture.string;

import java.util.Scanner;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성
 *
 * a#b!GE*T@S -> S#T!EG*b@a
 */
public class ReverseSpecificWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }

    static public String solution(String str) {
        // 처음과 끝을 지정해서 바꾸는 방법
        int lt = 0, rt = str.length() - 1;
        char[] cArr = str.toCharArray();

        while (lt < rt) {
            /**
             * Character.isAlphabetic(cArr[lt]) && Character.isAlphabetic(cArr[rt]) 이렇게 조건을 주면
             * 특수문자는 제자리에 두지만, 그에 상응하는 자리의 알파벳이 자리 이동을 못함.
             * 따라서 특수문자일 경우에는 lt와 rt의 자리를 이동시켜 알파벳의 뒤집기를 모두 할 수 있게 해야함
             */
            if(!Character.isAlphabetic(cArr[lt])){
                // 왼쪽 문자가 특수문자일 경우 다음 자리의 요소 비교를 위해 lt의 자리만 이동
                lt++;
            } else if (!Character.isAlphabetic(cArr[rt])) {
                // 오른쪽 문자가 특수문자일 경우 rt의 자리만 이동
                rt--;
            } else {
                // 모두 알파벳일 경우
                char tmp = cArr[lt];
                cArr[lt] = cArr[rt];
                cArr[rt] = tmp;
                lt++;
                rt--;
            }

        }
        return String.valueOf(cArr);
    }

}
