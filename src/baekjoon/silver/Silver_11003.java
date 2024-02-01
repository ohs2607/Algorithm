package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
N개의 수 A1, A2, ..., AN과 L이 주어진다.
Di = Ai-L+1 ~ Ai 중의 최솟값이라고 할 때, D에 저장된 수를 출력하는 프로그램을 작성하시오.
이때, i ≤ 0 인 Ai는 무시하고 D를 구해야 한다. (i는 1~N)
 */
public class Silver_11003 {
    // 1차 시도 : PriorityQueue - 정답은 나오지만 제출 결과는 시간 초과.
    /* Deque - 양쪽에 데이터를 넣고 뺄 수 있는 형태의 자료구조
               하나의 자료구조에 큐, 스택을 합쳐놓은 형태
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        StringBuilder sb = new StringBuilder();


        // 일단 i-l+1 의 값이 0 이하일때는 범위가 없지.
        // 그 다음부터 A1부터는 l만큼의 범위가 생겨서 슬라이딩 윈도우가 생각이 나긴하는데
        for (int i=1; i<n-l+1; i++){

        }

        System.out.println(sb);

    }
}
