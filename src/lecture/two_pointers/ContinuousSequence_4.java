package lecture.two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// n개의 수열에서 연속된 부분의 합이 m이 되는 경우의 수 구하기
public class ContinuousSequence_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(solution(n, m, arr));
    }

    static int solution(int n, int m, int[] arr){
        int answer = 0, sum = 0;

        // 슬라이딩 윈도우를 쓰기에는 길이가 고정적이지 않은데
        // 앞에서부터 두개의 포인터가 같이 늘어난다고 생각해보자
        int lt = 0, rt = 0;

        while (rt < n){ // 두 지점중 하나라도 범위를 넘어버리면 종료

            if (sum >= m){
                // 구하려는 수보다 크거나 같음(같을때 이전에 cnt를 증가시키고 맨 앞의걸 뺴고 다시 계산해야하니)
                sum -= arr[lt];
                lt++;
            } else {
                sum += arr[rt];
                rt++;
            }

            if (sum == m){
                answer++;
            }
        }
        return answer;
    }
}
/*
8 6
1 2 1 3 1 1 1 2
*/