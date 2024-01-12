package lecture.array;

import java.util.*;

/**
    그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서
    한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
    첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
 */
public class TempLeader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(resolve(n, arr));
    }

    static int resolve(int n, int[][] arr){
        // 같은 열에서 행을 비교해야 하니 i가 변경이 있어야함. j는 i가 다 돌때까지 고정

        int[] temp = new int[n];
        int[] result = new int[n]; // 각 학생의 같은반 횟수 결과

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                // 0,0 1,0 2,0 3,0 4,0  /  1,1 2,1 3,1 4,1 ...
                // arr[j][i] 이 해당 열에서 몇개가 있는지 확인하면 될텐데
                // 열을 따로 빼는 방법이 있을텐데 일단 모르니 노가다
                // 한열을 다 넣고나서 열의 요소 비교
                for (int k=0; k<n; k++){
                    temp[k] = arr[k][i];
                }
                //System.out.println("temp = " + Arrays.toString(temp));
                //System.out.println("i: " + i + ", j: " + j + " // " + temp[i] + " " +  arr[j][i]);
                for (int k=0; k<n; k++){
                    if (temp[k] == arr[j][i]){
                        result[k]++;
                    }
                }

            }
            //System.out.println();
        }
        //System.out.println("결과: " + Arrays.toString(result));
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i=0; i<n; i++){
            rank.put(result[i], i+1);
        }
        List<Integer> list = new ArrayList<>(rank.keySet());
        list.sort(Comparator.reverseOrder());

        return rank.get(list.get(0));
    }

}
/**
5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2
 */