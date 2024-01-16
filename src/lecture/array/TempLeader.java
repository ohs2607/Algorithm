package lecture.array;


import java.util.Scanner;

/**
 * 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서
 * 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 * 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
 */
public class TempLeader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) { // 5학년까지 정해져 있으니 5까지만 받기
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(resolve(n, arr));
    }

    static int resolve(int n, int[][] arr) {
        // arr[i][k] == arr[j][k]
        // i와 j는 학생 번호이며, k는 학년을 의미
        int answer = 0, max = 0;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        /*
                        1,1 1,1 / 1,2 1,2 / 1,3 1,3
                        1,1 2,1 / 1,2 2,2 / 1,3 2,3
                        1,1 3,1 / 1,2 3,2 / 1,3 3,3
                        한명의 학생이 기준이 되어서 각 학년별로 다른 학생들과 비교
                        학생 수를 세고 있기 때문에 3번 학생과 4번 학생이 2,3학년때 모두 같은 반이었어도
                        한번만 카운팅이 되어야 한다 */
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }
}
/**
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
 */