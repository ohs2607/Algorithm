package programmers.lv2;

/**
 * 석유 시추
 * 가로가 m, 세로가 n인 격자모양의 땅 속에서 석유가 발견되었다.
 * 석유는 여러 덩어리로 나눠 묻혀있고,
 * 시추관은 수직으로 단 하나만 뚫을 수 있을때, 가장 많은 석유를 뽑을 수 있는 시추관의 위치를 찾아라
 * (시추관은 열 하나를 관통하는 형태. 열과 열사이를 시추관으로 뚫을 수는 없다.)
 */
public class Oil {

    public static void main(String[] args) {
        Oil o = new Oil();
        int m = 8; // 가로
        int n = 5; // 세로

        int[][] land = new int[n][m]; // n행 m열
        land = new int[][]{
                {0, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 0, 0},
                {1, 1, 0, 0, 0, 1, 1, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 1, 1}
        };
        System.out.println(o.solution(land));
    }

    public int solution(int[][] land){
        int answer = 0;
        /* 시추관은 열에 따라서 들어감
           다차원배열의 length 는 행의 개수를 의미
           첫번째 요소의 길이는 첫번째 행의 개수를 의미
         */

        /** 열의 합들이 들어있는 배열 */
        int[] colResultArr = new int[land[0].length]; // 8개의 요소가 있는 배열

        for(int i = 0;i<land.length;i++){
            // 0,1,2,3,4
            for(int j = 0;j<land[i].length;j++){
                // 0,1,2,3,4,5,6,7,8

                if(land[i][j] == 1){
                    colResultArr[j] += 1;
                    // 이렇게 구하면 제대로 석유가 있는 열을 확인할 수는 있지만,
                    // 이제는 열끼리 붙어있는 경우도 확인해야 하는데
                    // 이대로면 비효율적으로 구할 것같음.

                    /** 이문제가 DFS 문제라는데 dfs를 푸는 방법을 공부해 와야겠다. */
                }
            }
        }
        for(int count : colResultArr){
            System.out.println("count = " + count);
        }
        return answer;
    }
}
