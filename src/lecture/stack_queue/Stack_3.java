package lecture.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/*
    게임 화면의 격자의 상태가 담긴 2차원 배열 board와
    인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
    크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성
*/
public class Stack_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];
        for (int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int m = Integer.parseInt(br.readLine());
        int[] moves = new int[m]; // 위치 배열
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i=0; i<m; i++){
            moves[i] = Integer.parseInt(st2.nextToken());
        }

        // 풀이
        // 1. moves의 요소 순서대로 해당 열
        // board[][move의 요소] - 이러면 0인 요소는 뛰어야 하는데 for문을 돌려야 하나..
        Stack<Integer> stack = new Stack<>();

        for (int x=0; x<m; x++){
            System.out.println("moves[x]] = " + moves[x]);
            // board 배열에서 각 열을 확인
            for (int i=0; i<n; i++){
                System.out.println("board[i][moves[x]] = " + board[i][moves[x]-1]);

                // 처음 나온 move 요소가 열이므로 고정
                if (board[i][moves[x]-1] != 0){
                    System.out.println("i 언제통과? = " + i);
                    /* 0이 아닌 값이 나오면 스택에 담고 해당 요소를 0으로 바꿈 */
                    stack.push(board[i][moves[x]-1]);
                    board[i][moves[x]-1] = 0;
                    break;
                }
            }
        }
        System.out.println(stack.toString());




    }
}
