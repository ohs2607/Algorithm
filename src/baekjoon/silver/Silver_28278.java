package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/* 스택2 */
/**
 첫째 줄에 명령의 수 N이 주어진다. (1 ≤ N ≤ 1,000,000)
 출력을 요구하는 명령이 주어질 때마다 명령의 결과를 한 줄에 하나씩 출력한다.
 */
public class Silver_28278 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        String beforeStr = "";
        int n = 0, x = 0;

        for (int i=0; i<cnt; i++){
            beforeStr = br.readLine();

            if (beforeStr.length() != 1){
                String[] nOne = beforeStr.split(" ");
                n = Integer.parseInt(nOne[0]);
                x = Integer.parseInt(nOne[1]);
            } else {
                n = Integer.parseInt(beforeStr);
            }

            if (n == 1) {
                stack.push(x);
            } else if (n == 2){
                if (stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    Integer popNum = stack.pop();
                    System.out.println(popNum);
                }
            } else if (n == 3){
                System.out.println(stack.size());

            } else if (n == 4){
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if (n == 5){
                if (stack.isEmpty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.get(stack.size()-1));
                }
            }

        }


    }
}
