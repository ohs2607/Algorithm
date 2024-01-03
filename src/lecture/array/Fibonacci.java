package lecture.array;

import java.util.Scanner;

/* 피보나치 수열 : 첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두 항의 합인 수열 */

/**
1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다

10
[1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i : solution(sc.nextInt())) {
            System.out.print(i + " ");
        }
    }

    static int[] solution(int n){
        int[] arr = new int[n];

        int num = 1;
        arr[0] = num;
        arr[1] = num;

        for (int i=2; i<n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
}

