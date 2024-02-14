package lecture.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Queue_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solution(str));
    }

    static String solution(String str){
        String answer = "YES";
        Queue<Character> queue = new ConcurrentLinkedQueue<>();
        for (char c : str.toCharArray()) {
            if (c == '('){
                queue.offer(c);
            } else {
                if (queue.isEmpty()) return "NO"; // 첫번째 문자가 왼쪽괄호라면 짝이 될 수 없음. 따라서 바로 종료

                /* 오른쪽 괄호이며 맨 첫번째 자리가 아니라면 기존에 들어간 왼쪽 괄호와 짝맞추기 */
                queue.poll();
            }
        }

        /* for문을 다 돌고나서 stack이 비어있어야 짝이 맞는 일반적인 괄호. */
        if (!queue.isEmpty()) return "NO";

        return answer;
    }
}
