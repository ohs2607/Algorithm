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
            // 0,1,2
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        /* 두개의 점 잡기 - lt, rt */
        int lt = 0;
        for (int rt = k-1; rt<n; rt++){
            // 오른쪽 지점은 map에 넣은 이후부터 (3)
            map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
            list.add(map.size());

            map.put(arr[lt], map.get(arr[lt]) - 1);

            if (map.get(arr[lt]) == 0){
                map.remove(arr[lt]);
            }
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