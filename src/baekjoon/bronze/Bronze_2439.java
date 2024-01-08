package baekjoon.bronze;

/*
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
*/

import java.util.Scanner;

/*
5 입력 후 결과
    *
   **
  ***
 ****
*****
*/
public class Bronze_2439 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                if ((i+j) < num-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
/*
0 -         4
1 -       3,4
2 -     2.3.4
3 -   1.2.3.4
4 - 0,1,2,3,4*/
