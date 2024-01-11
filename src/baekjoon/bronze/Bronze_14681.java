package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 주어진 점이 어느 사분면에 속하는지 알아내는 것
         (x , y)
1사분면 - (+ , +)
2사분면 - (- , +)
3사분면 - (- , -)
4사분면 - (+ , -)

(12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성.
단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다. */
public class Bronze_14681 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println(resolve(x, y));
    }

    static int resolve(int x, int y){
        if (x > 0 && y > 0){
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x > 0 && y < 0) {
            return 4;
        }
        return 0;
    }
}
