package lecture.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
    괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력
*/
public class Queue_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    static String solution(String str){
        String result = "YES";

        // stack은 LIFO 나중에 넣은게 제일 먼저 나옴
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return "NO"; // 첫번째 문자가 왼쪽괄호라면 짝이 될 수 없음. 따라서 바로 종료

                /* 오른쪽 괄호이며 맨 첫번째 자리가 아니라면 기존에 들어간 왼쪽 괄호와 짝맞추기 */
                stack.pop();
            }
        }

        /* for문을 다 돌고나서 stack이 비어있어야 짝이 맞는 일반적인 괄호. */
        if (!stack.isEmpty()) return "NO";
        return result;
    }
}
/*
(()(()))(()
NO

(())()
YES
*/