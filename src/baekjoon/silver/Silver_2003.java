package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다.
이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 */
public class Silver_2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1]; // 마지막 부분 ArrayIndexOutOfBoundsException 방지용
        // 그냥 n개대로 개수를 맞추고 while문의 조건을 true로 둔 다음, end와 n이 같아지는 순간 break해도 된다.

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        System.out.println(solution(n, m, arr));
    }

    static int solution(int n, int m, int[] arr) {
        int start = 0, end = 0, sum = 0, cnt = 0;

        while (end < n){
            if (sum >= m){
                // 찾는 수보다 sum이 크다면 시작값 뺴주고 앞의 포인터를 옆으로 이동
                sum -= arr[start];
                start++;

            } else {
                // 찾는 수보다 sum이 작다면 그대로 오른쪽 포인터의 값을 더한뒤 옆으로 이동
                sum += arr[end];
                end++;
            }

            if (sum == m){
                cnt++;
            }
        }
        return cnt;
    }
}
/**
 * 4개의 요소, 수열의 A[i] + A[i+1] + … + A[j-1] + A[j]가 2가 되는 경우
 * 아 떨어져 있으면 안되고 연달아 더한 합이 해당 숫자인 경우
4 2
1 1 1 1 -> 3

10 5
1 2 3 4 2 5 3 1 1 2 -> 3

(2,3 / 5 / 3,1,1)
 */