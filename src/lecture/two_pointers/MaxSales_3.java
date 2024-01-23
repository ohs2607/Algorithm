package lecture.two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
    n일(전체)동안의 매출기록을 주고, 연속된 k일(특정기간) 동안의 최대 매출액이 얼마안지 구하기

    만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
    12 1511 20 2510 20 19 13 15
    연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

    *Sliding Window*
    고정 사이즈의 윈도우가 이동하면서 윈도우 내에 있는 데이터를 이용해 문제를 풀이
 */
public class MaxSales_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] sales = new int[n];
        for (int i=0; i<n; i++){
            sales[i] = Integer.parseInt(st2.nextToken());
        }
        System.out.println(solution(n, k, sales));
    }

    static int solution(int n, int k, int[] sales){
        int max = 0, tmp = 0;

        /* 1. 2중 for문으로 풀기 - 시간복잡도 매우 증가O(N2). 쓰지 않기 X */
        // 그냥 for문으로 푼다고 생각하면.. 10이면 0~9 연달아 k일이기 때문에 배열을 초과하지 않게
        /**for (int i=0; i<=n-k; i++){
            for (int j=0; j<k; j++){
                tmp += sales[i+j];
            }
            if (tmp > max){
                max = tmp;
            }
            tmp = 0;
        }*/

        /* 2. Sliding Window 사용하기 - O(N) 으로 시간복잡도가 줄어든다
           k개의 합을 처음 구해놓고, 그 다음부터는 k개 이후의 바로 다음 요소값을 더하고,
           [i-k] index 값을 빼주면 다음 k개의 합이된다

           ! 지점을 줄 필요가 없다. */
        for (int i=0; i<k; i++){
            tmp += sales[i];
        }
        for (int i=k; i<n; i++){
            tmp = tmp + sales[i] - sales[i-k];
            max = Math.max(tmp, max);
        }
        return max;
    }
}
/*
10 3
12 15 11 20 25 10 20 19 13 15
*/