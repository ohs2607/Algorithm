package lecture.string;

import java.util.Scanner;

/**
 * 알파벳 대문자로 이루어진 문자열을 입력받아
 * 같은 문자가 연속으로 반복되는 경우
 * 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로
 * 문자열을 압축하는 프로그램을 작성하시오.
 *
 * 반복 횟수가 1이면 생략 (숫자만 생략이지 알파벳은 그대로 써줘야 함)
 * KKHSSSSSSSE -> K2HS7E
 */
public class StrCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.next()));
    }

    static String solution(String str){
        String result = "";
        int count = 1; // 반복 횟수를 담을 변수
        str = str + " ";

        // 반복이 일어나면 해당 반복 문자열 옆에 반복횟수를 숫자로 작성
        // KKHSSSSSSSE
        for (int i=0; i<str.length()-1; i++){
            // i+1로 비교하면 마지막 문제 발생
            // length - 1을 포함시키면 마지막 문자를 거치지만 i+1의 값이 없기 때문에 문제가 생겨
            // 따라서 기존 문자열에 문제가 없도록 index를 비어서 하나 추가해야해

            if(str.charAt(i) == str.charAt(i+1)){
                // 중복이 되는 경우에는 아직 결과를 담지는 말고 중복 카운트만 증가시키기
                count++;
            } else {
                // 더이상 중복이 없으면 새로운 결과 변수에 해당 문자와 중복 횟수 저장
                result += str.charAt(i);
                if(count > 1) result += String.valueOf(count);

                // 종복 카운트 초기화
                count = 1;
            }
        }
        return result;
    }
}
