package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
N개의 수로 된 수열 A[1], A[2], …, A[N] 이 있다.
이 수열의 i번째 수부터 j번째 수까지의 합 A[i] + A[i+1] + … + A[j-1] + A[j]가 M이 되는 경우의 수를 구하는 프로그램을 작성하시오.
 */
public class Silver_2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[cnt];

        StringTokenizer token = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(token.nextToken());
        }
        System.out.println(solution(cnt, num, arr));
    }

    static int solution(int cnt, int num, int[] arr) {
        int sum = 0;
        int result = 0; // 합이 sum이 되는 경우

        // 시작점과 끝점을 잡는다 (범위 지정을 위함)
        int start = 0, end = 0;

        while (start < cnt) {
            if (sum >= num) sum -= arr[start++];//sum이M보다커졌을때,새로운현재값을빼주고,start를한칸앞으로이동한다.
            else if (end == num) break;
            else sum += arr[end++];//(sum이M보다작을떄)sum에새로운현재값을더해준후,end포인터를한칸이동

            if (sum == num) result++;//sum이M과같은값일때
        }


        return result;
    }
}
/**
 * 4개의 요소, 수열의 A[i] + A[i+1] + … + A[j-1] + A[j]가 2가 되는 경우
4 2
1 1 1 1 -> 3
 * <p>
10 5
1 2 3 4 2 5 3 1 1 2 -> 3
 */