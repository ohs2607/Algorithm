package lecture.array;

/* 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점. 최종 점수 구하기 */

import java.util.Scanner;

/**
 1문제 맞으면 1점, O -> 1
 틀린 문제는 0점, X -> 0
 앞에 틀리고 다음에 맞으면, 1점 XO -> 1
 연속으로 정답이면, OO -> 2, OOO -> 3 ...
10
1 0 1 1 1 0 0 1 1 0   */
public class Score {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(solution(n, arr));
    }

    static int solution(int n, int[] arr){
        int result = 0;
        int plus = 0;

        // 바로 앞의 요소 확인
        for (int i=0; i<n; i++){
            // 정답이면서 바로 앞 문제도 정답인 경우
            if (i > 0){
                if (arr[i] == 1 && arr[i-1] == 1) plus = plus + arr[i];
            }
            result += arr[i];

            if (arr[i] == 0) plus = 0;
            result += plus;
        }
        return result;
    }
}
