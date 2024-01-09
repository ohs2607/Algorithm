package lecture.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }

    static int solution(int n, int[][] arr){
        // 각 행의 합, 열의 합, 두 대각선의 합
        int width = 0, len = 0;

        int[] widthArr = new int[n];
        int[] lenArr = new int[n];

        int max = 0, lSum = 0, rSum = 0;

        // 1. 각 행, 열의 합중 최대값
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                width += arr[i][j];
                len += arr[j][i];
            }
            widthArr[i] = width;
            lenArr[i] = len;

            width = 0;
            len = 0;
        }

        Arrays.sort(widthArr);
        Arrays.sort(lenArr);

        max = Math.max(widthArr[n-1], lenArr[n-1]);

        // 대각선 비교
        for (int i=0; i<n; i++){
            for (int j=i; j<=i ;j++){
                lSum += arr[i][j];
            }
            for (int j=n-i-1; j>=n-i-1 ;j--){
                rSum += arr[i][j];
            }
        }

        if (max <= (Math.max(lSum, rSum))) {
            max = Math.max(lSum, rSum);
        }
        return max;
    }

}
/*
5
10 13 10 12 15
12 39 30 23 11
11 25 50 53 15
19 27 29 37 27
19 13 30 13 19

60
115
154
139
94

71  117  149  128  87

0,0
    1,1
        2,2
            3,3
                4,4
                0,4
            1,3
        2,2
    3,1
4,0
 */