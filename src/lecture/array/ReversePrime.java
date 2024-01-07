package lecture.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* N개의 자연수가 입력되면 각 자연수를 뒤집은 후
   그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램 */

// res = res * 10 + t
/** 예를 들어 32를 뒤집으면 23이고, 23은 소수, 단 910을 뒤집으면 19 - 첫자리부터 연속된 0 무시
9
32 55 62 20 250 370 200 30 100
*/
public class ReversePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        for (int rstl : solution(n, arr)) {
            System.out.print(rstl + " ");
        }
    }

    // 소수인지 확인하는 함수
    static boolean isPrime(int num){
        if (num == 1) {return false;
        for (int i=2; i<num; i++){
            if (num % i ==0) return false;
        }
        return true;
    }

    static List<Integer> solution(int n, int[] arr){
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<n; i++){
            int tmp = arr[i];
            // res에 뒤집힌 결과가 저장
            int res = 0;

            while (tmp > 0){
                // 1. tmp를 10으로 나눠서 나머지를 구함 (나머지는 마지막 자리가 됨 - 123이라면 3)
                int t = tmp % 10;
                // 2. 자릿수를 뒤집는 공식을 적용한다
                res = (res * 10) + t;
                // 3. 다음 자리를 가져오기 위해 tmp를 10으로 나눈 몫을 다시 tmp에 담는다
                tmp = tmp / 10;
            }
            if (isPrime(res)) result.add(res);
        }
        return result;
    }
}
