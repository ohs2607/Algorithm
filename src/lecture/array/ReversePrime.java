package lecture.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* N개의 자연수가 입력되면 각 자연수를 뒤집은 후
   그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램 */
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

    static List<Integer> solution(int n, int[] arr){
        // 해당 문제는 특정 숫자가 소수인지를 확인하는 문제.
        List<Integer> result = new ArrayList<>();

        // StringBuilder로 문자화 한 뒤, reverse로 뒤집고,
        // 다시 Integer.parseInt로 숫자로 변환
        int check = 0;

        for (int i=0; i<n; i++){
            int reverseNum = Integer.parseInt(new StringBuilder(""+arr[i]).reverse().toString());

            for (int j=2; j<reverseNum; j++){
                // 뒤집은 숫자가 약수가 있는 경우
                if (reverseNum % j == 0) check++;
            }
            if (check == 0 && reverseNum != 1){
                result.add(reverseNum);
            }
            check = 0;
        }
        return result;
    }
}
