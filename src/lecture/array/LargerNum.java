package lecture.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력 */
// 7 3 9 5 6 12 -> 7 9 6 12
public class LargerNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int[] arr = new int[cnt];

        for (int i=0; i<cnt; i++){
            arr[i] = Integer.parseInt(sc.next());
        }

        for (int num : solution(arr)) {
            // 첫번째 방법일 경우 출력부분에서 조건문이 필요함 (불필요한 코드가 생김)
            /**if(num != 0){
                System.out.print(num + " ");
            }*/

            System.out.print(num + " ");
        }
    }

    static List<Integer> solution(int[] arr){
        // 1. 똑같은 길이의 배열에, 자기 앞보다 더 클 경우만 담고 전체 출력시 값이 없는 부분 뺴고 출력 (지저분함)
        /**int[] result = new int[arr.length];
        result[0] = arr[0];

        for (int i=arr.length-1; i>0; i--){
            if(arr[i] > arr[i-1]){
                result[i] = arr[i];
            }
        }
        return result;*/

        // 2. ArrayList에 담기
        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i=1; i<arr.length; i++){
            if(arr[i] > arr[i-1]) result.add(arr[i]);
        }
        return result;
    }
}


