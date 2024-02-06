package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/*
널리 잘 알려진 자료구조 중 최대 힙이 있다. 최대 힙을 이용하여 다음과 같은 연산을 지원하는 프로그램을 작성하시오.

배열에 자연수 x를 넣는다.
배열에서 가장 큰 값을 출력하고, 그 값을 배열에서 제거한다.
프로그램은 처음에 비어있는 배열에서 시작하게 된다.

만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고,
x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다. 입력되는 자연수는 231보다 작다.

입력에서 0이 주어진 횟수만큼 답을 출력한다. 만약 배열이 비어 있는 경우인데 가장 큰 값을 출력하라고 한 경우에는 0을 출력하면 된다.
*/
public class Silver_11279 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        /* 가장 큰 값을 출력해야 하기 때문에 우선순위를 매겨서 뺴내는 priority Queue를 사용한다 */
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        for (int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());

            // 0일경우 배열에 값이 있다면 그 중 가장 큰 값을 출력해야하니 isEmpty 조건 필요
            if (num == 0) {
                sb = !pQ.isEmpty() ? sb.append(pQ.poll() + "\n") : sb.append(0 + "\n");
            } else {
                // 0이 아닌 자연수는 queue에 추가함
                pQ.offer(num);
            }
        }
        System.out.println(sb);
    }
}
/*
최대 힙
    - 최대 트리는 각 노드의 키값이 *자식노드가 있는 경우에*, 그 자식의 key값보다 크거나 같은 트리.
    - 최대 힙은 최대 트리이면서 완전 이진 트리
최소 힙
    - 최소 트리는 각 노드의 키값이 자식 노드가 있을 떄, 그 자식의 key값보다 작거나 같은 트리
    - 최소 힙은 최소 트리이면서 완전 이진 트리

최대 힙(Max Heap) : 부모 노드는 자식 노드보다 작지만 않으면 된다. + 완전이진트리이다.
최소 힙(Min Heap) : 부모 노드는 자식 노드보다 크지만 않으면 된다. + 완전이진트리이다.

[완전 이진트리란 노드를 삽입할떄, 왼쪽부터 차례대로 삽입하는 트리]

13
0
1
2
0
0
3
2
1
0
0
0
0
0
 */