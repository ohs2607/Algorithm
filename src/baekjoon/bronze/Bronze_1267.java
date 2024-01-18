package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
영식 요금제 - 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다.
            만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
민식 요금제 - 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다.
            만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.

통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력
N - 통화의 개수, 둘째줄은 통화시간

만약 두 요금제의 요금이 모두 같으면 영식을 먼저 쓰고 민식을 그 다음에 쓴다.
영식은 Y로, 민식은 M으로 출력한다.
 */
public class Bronze_1267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] times = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }

        // 풀이
        int yFee = 0;
        int mFee = 0;

        for (int x : times) {
            yFee += 10 * (x/30 + 1);
            mFee += 15 * (x/60 + 1);
        }

        if (yFee < mFee){
            System.out.println("Y " + yFee);
        } else if (yFee > mFee){
            System.out.println("M " + mFee);
        } else {
            System.out.println("Y M " + yFee);
        }
    }
}
/*
3
40 40 40

영식: 20 + 20 + 20 = 60
민식: 15 + 15 + 15 = 45
M 45
더 싼 요금제의 이름, 나올 요금
 */