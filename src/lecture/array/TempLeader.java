package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

/**
    그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서
    한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 */
public class TempLeader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // 봉우리와 다르게 가장자리가 0으로만 되어있는게 아니라 0,0을 제외하고 1~n까지로 들어있어야 함
        // 0,1  0,2  0,3  0,4  0,5
        for (int j=1; j<=n; j++){
            arr[0][j] = j;
            arr[j][0] = j;
        }
        for (int i=0; i<n+2; i++){
            for (int j=0; j<n+2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(resolve(n, arr));
    }

    static int resolve(int n, int[][] arr){
        int[] student = new int[n];

        // 배열이 주어질때 행은 학생의 번호이고 열은 학년이다.
        /* 같은 반이었던 학생을 비교하려면, 열 고정 행 비교가 필요하다 */
        // i,j에서 3,2 자리의 학생이면 , 0,2/1,2/4,2

        // 제일 원초적으로 생각하는건 아래 위 비교
        /* 비교대상
        1,1 1,2 1,3 1,4 1,5
        2,1 2,2 2,3 2,4 2,5
        3,1 3,2 3,3 3,4 3,5
        4,1 4,2 4,3 4,4 4,5
        5,1 5,2 5,3 5,4 5,5
         */


        return student[n-1];
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