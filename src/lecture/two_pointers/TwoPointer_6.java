package lecture.two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoPointer_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        /* rt가 가리키는 곳이 0일때가 중요 */
        int lt = 0, rt = 0, answer = 0;

        // cnt는 0->1로 변경한 횟수, cnt < k
        int cnt = 0;

        // 연속된 수열의 길이가 최종 목표
        /* rt -lt + 1 */

        for (rt=0; rt<n; rt++){
            if (arr[rt] == 0){
                // 0을 만나면 변경 횟수를 증가
                cnt++;
            }

            while (cnt > k){
                if (arr[lt] == 0) cnt--;
                lt++; // 1인 지점만 나온다면 그냥 왼쪽지점도 하나씩 쭉 증가
            }
            answer = Math.max(answer, rt-lt+1);
        }
        System.out.println(answer);
    }
}
