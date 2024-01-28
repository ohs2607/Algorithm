package practice;

// 재귀 함수 (Recursion Function)
public class Recursion {
    /* 함수 내부에서 자기 자신을 호출하는 함수 */

    public static void main(String[] args) {
        System.out.println(recursion(10));
        System.out.println(power(2, 10));
    }

    static int recursion(int i){
        // 1. 팩토리얼 계산
        /*if (i == 0){
            return 1;
        } else {
            return i * recursion(i-1);
        }*/

        // 2. 연속된 자연수의 합
        if (i == 1){
            return 1;
        } else {
            return i + recursion(i-1);
        }
    }

    static int power(int n, int exponent){
        // 3. 거듭제곱
        if (exponent == 0){
            return 1;
        } else {
            return n * power(n, exponent-1);
        }
    }


}
