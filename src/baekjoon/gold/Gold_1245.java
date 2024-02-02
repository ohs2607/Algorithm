package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 농부 민식이가 관리하는 농장은 N×M 격자로 이루어져 있다.
 * 민식이는 농장을 관리하기 위해 산봉우리마다 경비원를 배치하려 한다.
 * 이를 위해 농장에 산봉우리가 총 몇 개 있는지를 세는 것이 문제다.
 */
/*
산봉우리의 정의는 다음과 같다.

산봉우리는 같은 높이를 가지는 하나의 격자 혹은 인접한 격자들의 집합으로 이루어져 있다.
(여기서 "인접하다"의 정의는 X좌표 차이와 Y좌표 차이 모두 1 이하일 경우로 정의된다.)
또한 산봉우리와 인접한 격자는 모두 산봉우리의 높이보다 작아야한다.
문제는 격자 내에 산봉우리의 개수가 총 몇 개인지 구하는 것이다.

상하좌우가 가운데보다 모두 작아야함
 */
public class Gold_1245 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stoken = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stoken.nextToken());
        int m = Integer.parseInt(stoken.nextToken());
        int[][] arr = new int[n + 2][m + 2];


        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n+2; i++) {
            for (int j = 0; j < m+2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        /* 좌표 사용  - 8방! */
        int dx[]= {-1,1,0,0,1,1,-1,-1};
        int dy[]= {0,0,-1,1,1,-1,1,-1};

        int result = 0;
        // 3중 for문
        for (int i=1; i<=n; i++){
            for (int j=1; j<=m; j++){

                boolean check = true;
                for (int k=0; k<8; k++){
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
        System.out.println(result);

    }
}
/*
8 7
4 3 2 2 1 0 1
3 3 3 2 1 0 1
2 2 2 2 1 0 0
2 1 1 1 1 0 0
1 1 0 0 0 1 0
0 0 0 1 1 1 0
0 1 2 2 1 1 0
0 1 1 1 2 1 0

-> 3
*/