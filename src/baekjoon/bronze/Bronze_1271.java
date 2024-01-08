package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

/** 엄청난 부자2 **

입력 - 첫째 줄에는 최백준 조교가 가진 돈 n과
돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수)
1000 100

출력 - 첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
10
0  */

public class Bronze_1271 {
/* 단순히 몫과 나머지를 구하는 문제인줄 알았는데 BigInteger를 사용해야 하는 문제였다. */
// 주어진 m과 n의 범위가 매우 크기 때문에
// 무한의 정수가 들어갈 수 있는 가능성이 있다면 BigInteger 라는 클래스를 활용하는 것이 좋다고 한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BigInteger 사용
        BigInteger money = sc.nextBigInteger();
        BigInteger people = sc.nextBigInteger();

        // BigInteger는 사칙연산을 메서드로 쓴다.
        System.out.println(money.divide(people));
        System.out.println(money.remainder(people));
    }

    // 잘못된 풀이
    /**static int[] solution(int money, int num){
        // 몫과 나머지 - #해당 코드는 런타임 에러 발생
        int[] result = new int[2];
        result[0] = money / num;
        result[1] = money % num;

        return result;
    }*/

}
