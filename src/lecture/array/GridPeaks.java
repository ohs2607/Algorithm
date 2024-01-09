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

        // 1. 단순하지만 지저분
        /**for (int i=1; i<=n; i++){
            for (int j=1; j<=n ;j++){
                // 상하좌우 비교.
                if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j]
                        && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1]){
                    result++;
                }
            }
        }*/

        /* 2. 상,하,좌,우를 구할 수 있게 정해진 배열 사용 */
        // 4방향이면 if문으로 모두 비교해도 문제는 없지만
        // 대각선까지 8가지 방향이라면 자리를 구할 수 있는 배열을 지정해서 구하는게 더 편리할 수 있다
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        // 3중 for문
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){

                boolean check = true;
                for (int k=0; k<4; k++){
                    // 1,1 - 0,1(상)   1,2(우)   2,1(하)   1,0(좌)
                    int nx = i+dx[k];
                    int ny = j+dy[k];

                    if(arr[i][j] <= arr[nx][ny]){
                        check = false; // 한번이라도 주변이 같거나 더 크다면 false가 됨
                        break; // 상하좌우 중 하나라도 봉우리의 조건에 해당하지 않으면 다른 방향을 볼 필요가 없다
                    }
                }
                if (check) result++;
            }
        }
        return result;
    }
}
/**
5
5 3 7 2 3
3 7 1 6 1
7 2 5 3 4
4 3 6 4 1
8 7 3 5 2  -> 결과 10
 */