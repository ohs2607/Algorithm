package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 이상한 곱셈 (각 자릿수들끼리 한자릿수씩 곱한 값들을 모두 더한 결과
* 결과는 long 타입 주의 - 수의 크기 제한이 10000자리 이하이기 떄문 (두 수가 10000자리 일 경우 int의 범위를 넘어감)
* */

// 123 45
// 54
public class Bronze_1225 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        long result = 0;
        for (int i=0; i<a.length(); i++){
            for (int j=0; j<b.length(); j++){
                result += (a.charAt(i) - '0') * (b.charAt(j) - '0');
            }
        }
        System.out.print(result);
    }

}
