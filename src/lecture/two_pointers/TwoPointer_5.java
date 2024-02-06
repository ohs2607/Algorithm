package lecture.two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성 */
public class TwoPointer_5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1~n까지 들어있는 배열
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = i+1;

        // 풀이
        int lt = 0, rt = 0, sum = 0, answer = 0;
        while (rt < n-1){
            if (sum < n){
                // n보다 sum이 작은 경우
                sum += arr[rt];
                rt++;
            } else {
                // 합이 n보다 같거나 큰 경우
                sum -= arr[lt];
                lt++;
            }

            if (sum == n){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
