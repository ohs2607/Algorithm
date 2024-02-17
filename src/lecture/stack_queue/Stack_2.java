package lecture.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요 */
public class Stack_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solution(str));
    }

    static String solution(String str){
        String answer = "";
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            // 닫는 괄호가 나오면 가장 최근에 넣은 여는 괄호와 짝을 짓는데
            // 짝이 되기 까지 있는 알파벳들은 모두 꺼내줌
            if (c == ')'){

                /* 닫는 괄호가 등장하면 짝이 맞는 여는 괄호가 나올때까지 stack의 요소들을 꺼냄 */
                while(stack.pop() != '(');
                // 여는 괄호가 나오면 while문 나옴.
            } else {
                // 여는괄호나 알파벳은 무조건 stack에 push
                stack.push(c);
            }
        }
        for (int i=0; i<stack.size(); i++) answer += stack.get(i);
        return answer;
    }
}
/*
(A(BC)D)EF(G(H)(IJ)K)LM(N)
EFLM

AB(C(D)EF)G(H(I(JK)))
ABG
*/