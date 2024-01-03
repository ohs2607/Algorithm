package lecture.array;

import java.util.Scanner;

/**
 * 학생을 일렬로 세웠을 때의 학생의 키가 앞에서부터 순서대로 주어지고
 * 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하기

8
130 135 148 140 145 150 150 153
 */
public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] students = new int[n];

        for (int i=0; i<n ; i++){
            students[i] = Integer.parseInt(sc.next());
        }
        System.out.println(solution(n, students));
    }

    static int solution(int n, int[] students){
        int answer = 1; // 시작은 제일 첫번쨰 학생의 키가 기준

        /**for (int i=0; i<n-1; i++){
            if(students[i] < students[i+1]) {
                answer++;
            } else {
                // 앞에 있던 값이 더 크다면 자리 변경 후 비교할 수 있게
                students[i+1] = students[i];
            }
        }*/

        // max 사용
        int max = students[0]; // 제일 첫번쨰 학생의 키
        for (int i=1; i<n; i++){
            if(max < students[i]) {
                answer++;
                max = students[i];
            }
        }

        return answer;
    }
}

