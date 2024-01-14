package baekjoon.bronze;

/* 두 정수 N과 F가 주어진다. 지민이는 정수 N의 가장 뒤 두 자리를 적절히 바꿔서 N을 F로 나누어 떨어지게 만들려고 한다.
만약 가능한 것이 여러 가지이면, 뒤 두 자리를 가능하면 작게 만들려고 한다.
예를 들어, N=275이고, F=5이면, 답은 00이다. 200이 5로 나누어 떨어지기 때문 */
// 첫째 줄에 N, 둘째 줄에 F가 주어진다. N은 100보다 크거나 같고, 2,000,000,000보다 작거나 같은 자연수이다. F는 100보다 작거나 같은 자연수
// 첫째 줄에 마지막 두 자리를 모두 출력한다. 한자리이면 앞에 0을 추가해서 두 자리로 만들어야 한다.
// 1021 11 이면, 정답은 01 -> 1001이 11로 나누어 떨어지기 때문
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
1000
3
-> 02
 */
public class Bronze_1075 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        // 제일 먼저 n의 뒤 두자리를 00으로 바꿔준다 1234면 100으로 나눈 나머지를 기존 n에서 빼줌
        n -= n % 100;

        // 나누어 떨어지는 뒤 두자리만 가능한 작은 수를 찾아야 하니 바꿔준 n값부터 1씩 증가하며 F로 나눠 떨어지는지 확인
        while (true){
            if (n % f == 0){
                if (n % 100 < 10) System.out.println("0" + n%100);
                else System.out.println(n%100);
                break;
            }
            n++;
        }
    }
}
