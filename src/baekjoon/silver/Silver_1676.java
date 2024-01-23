package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.*/
public class Silver_1676 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 5의 배수마다 0이 늘어난다. 5~9!까지는 0이 1개, 10~14까지는 0이 2개 이런식으로
        // 주어진 숫자를 5로 나눈 몫을 구한다. 9면 1, 13은 2, 18은 3
        /* 그러나 25부터 몫 + 1 이 0의 개수가 된다 -> 5의 n승 (n>2)이 되는 순간 0이 +2씩 늘어남 */
        int cnt = 0;
        while (n >= 5){
            cnt += n / 5;

            // 5의 n승 이상일 경우 (n>=2) 0이 하나 더 누적되어야 하므로 다시 5로 나눠줌
            // 5이상이면 다시 while문 안에 들어오니까
            n /= 5;
        }
        System.out.println(cnt);
    }
}
