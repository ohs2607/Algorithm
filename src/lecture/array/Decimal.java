package lecture.array;

import java.util.Scanner;

/* 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력 */
public class Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }

    static int solution(int num){
        boolean isDecimal = true;
        int result = 0;

        for (int i = 0; i<num; i++){
            for (int j=2; j<=i; j++){
                if(num % j == 0){
                    System.out.println(j + " ");
                    isDecimal = false;
                }
            }
            if(isDecimal) result++;
        }
        return result;
    }
}
