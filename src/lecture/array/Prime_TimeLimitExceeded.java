package lecture.array;

import java.util.Scanner;

/* 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력 */
// 소수는 약수가 1과 자기 자신밖에 없는 수 (1은 제외)
public class Prime_TimeLimitExceeded {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }

    static int solution(int num){
        int result = 0;
        int cnt = 0;
        // num = 10 이라면 소수는 2, 3, 5, 7                  (4)
        //       20             2, 3, 5, 7, 11, 13, 17, 19  (8)

        // 방법 1. 2부터 ~ 확인하는 수 전까지 나눠보고 나머지가 0인 경우가 없다면 소수.
        // 시간복잡도 O(N)
        for (int i=2; i<num; i++){
            // 10까지 수를 다 확인해봐야 함 시작은 2부터
            for (int j=2; j<=i; j++){
                // 나누는 수도 1을 제외하고 약수가 자기 자신 하나인지를 확인하기 위해 2부터 시작
                // 나머지가 0인 경우가 1번 이상인건 소수가 아니므로 해당 for문을 돌고나면 cnt가 1인 값만 확인
                if (i % j == 0) cnt++;
            }

            if (cnt == 1) result++; // cnt가 1이면 약수가 자기자신 하나이므로 소수.
            cnt = 0; // 초기화
        }
        return result;
    }
}
