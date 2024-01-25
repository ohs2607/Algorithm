package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*  [수열 P 출력하기]
    P[0], P[1], ...., P[N-1]은 0부터 N-1까지(포함)의 수를 한 번씩 포함하고 있는 수열
    수열 P를 -> 길이가 N인 배열 A에 적용하면 길이가 N인 배열 B가 된다
    적용하는 방법은 B[P[i]] = A[i]이다.

    배열 A가 주어졌을 때, 수열 P를 적용한 결과가 비내림차순이 되는 수열을 찾는 프로그램
    비내림차순이란, 각각의 원소가 바로 앞에 있는 원소보다 크거나 같을 경우
*/
public class Silver_1015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] p = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        /* 2 3 1 */
        // 이 경우에 비 내림차순을 만들면, 1 2 3 이고 이게 배열b
        // b[p[0]] = a[0] = 2   -> b에서 요소가 2인 자리는 1 따라서 p[0] = 1
        // b[p[1]] = a[1] = 3   -> p[1] = 2
        // b[p[2]] = a[2] = 1   -> p[2] = 0
        // p는 1 2 0

        // 1. 비내림차순 배열 b 생성
        int[] b = Arrays.stream(arr).sorted().toArray();

        for (int i=0; i<n; i++){
            b[p[i]] = arr[i];

        }

    }

}
