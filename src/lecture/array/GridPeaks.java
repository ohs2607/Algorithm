package lecture.array;

import java.util.Scanner;

/* 봉우리 지역이 몇개 있는지 찾기 */
// n*n 격자판의 각 격자에 그 지역의 높이가 쓰여있다
// 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역.
// 격자의 가장자리는 0으로 초기화 되어있다

public class GridPeaks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];

        // 5라면 0인 가장자리까지 해서 7이 된다.
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(resolve(n, arr));
    }

    static int resolve(int n, int[][] arr){
        // 상하좌우 4곳을 모두 비교해 가운데 숫자가 가장 큰 숫자여야 함
        int result = 0;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n ;j++){
                // 상하좌우 비교.
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j]
                        && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]){
                    result++;
                }
            }
        }
        return result;
    }
}
