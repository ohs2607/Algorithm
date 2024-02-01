package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/* 최소 힙
    1. PriorityQueue 생성
    2. 출력을 위한 공간인 StringBuilder 생성
    3. 자연수면 pQ.offer로 큐에 넣기
    4. 0이면 큐가 비어있는지 먼저 확인
    5. 큐에 값이 들어있다면 pQ.poll로 빼내고, 뺴낸 값을 sb에 저장
    6. 없다면 그대로 0을 sb에 추가
*/
public class Silver_1927 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pQ = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0){
                sb = !pQ.isEmpty() ? sb.append(pQ.poll() + "\n") : sb.append(0 + "\n") ;
            } else  pQ.offer(num);
        }
        System.out.println(sb);
    }
}
