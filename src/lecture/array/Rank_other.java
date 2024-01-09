package lecture.array;

import java.util.Scanner;

/**
5
87 89 92 100 76 -> 4 3 2 1 5
*/
public class Rank_other {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scoreArr = new int[n];

        for (int i=0; i<n; i++){
            scoreArr[i] = sc.nextInt();
        }
        for (int i : solution(n, scoreArr)) {
            System.out.print(i + " ");
        }
    }

    static int[] solution(int n, int[] scoreArr){
        int[] answer = new int[n];

        for (int i=0; i<n; i++){
            int cnt = 1;

            for (int j=0; j<n; j++){
                if (scoreArr[i] < scoreArr[j]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
