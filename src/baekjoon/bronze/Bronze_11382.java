package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 3개의 정수들의 합 - 런타임 에러 발생 */
// 1 ≤ A, B, C ≤ 10(12승) 범위로 인해 출력 값이 int 범위보다 클 수 있기 때문에 long을 사용
public class Bronze_11382 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        System.out.println(A+B+C);
    }


}
