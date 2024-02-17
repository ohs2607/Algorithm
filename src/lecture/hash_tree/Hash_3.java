package lecture.hash_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/*
7 4
20 12 20 10 23 17 10

    3 4 4 3
    n일 동안의 매출액 종류
 */
public class Hash_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st2.nextToken());

        // 풀이
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<k-1; i++){
            // 0,1,2 (4일치를 넣어야 하는거 아닌가?)
            // 4일치의 매출액 개수를 구해야 하니 4일째부터를 for문을 돌려 확인해야하기 때문
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        /* 두개의 점 잡기 - lt, rt */
        int lt = 0;
        for (int rt = k-1; rt<n; rt++){
            // 오른쪽 지점은 k일차가 되는 부분부터 시작

            /* 1.4일차의 매출액과 그 횟수를 넣음 - 이미 있으면 추가 카운팅하기 위해 getOrDefault 사용 */
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);

            /* 2.추가 후 현재 map의 개수를 결과 list에 담음 */
            list.add(map.size());

            /* 3.이제 다음 for문에 들어가면 rt가 하나 옆으로 이동했기 때문에 k일치를 맞추기 위해 lt도 이동하는데
            * lt를 이동하면서 해당 lt는 이제 k일치에서 빠지게 되니 map의 value인 등장 횟수를 하나 감소시킴
            *  */
            map.put(arr[lt], map.get(arr[lt]) - 1);

            /* 4.value가 0이 되어도 map.size는 해당 매출액을 카운팅하기 때문에, 아예 map에서 지워버려야함 */
            if (map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }

            /* 5.rt도 옆으로가니 lt도 옆으로 가서 k일 범위를 맞춤 */
            lt++;
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
/*
현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고
연속된 K일 동안의 매출액의 종류를 각 구간별로 구하라고 했습니다.

만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
20 12 20 10 23 17 10
각 연속 4일간의 구간의 매출종류는

첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
매출액의 종류를 출력하는 프로그램을 작성하세요.
*/