package lecture.array;

import java.util.Scanner;

// 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
// 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
// M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력
/*
첫 번째 줄에 반 학생 수 N(1<=N<=20)과 , M(1<=M<=10)이 주어진다.
두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.
 */
public class Mentoring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수 N, 테스트 횟수 M 입력
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 학생 등수 기록 배열
        int[][] rankings = new int[M][N];

        // 테스트 결과 입력 및 등수 기록
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                rankings[i][sc.nextInt() - 1] = j + 1; // 학생 번호는 1부터 시작
                // 3 4 1 2
            }
        }

        // 짝의 경우 카운트
        int count = 0;

        // 모든 학생 쌍에 대해 짝을 찾기
        for (int mentor = 0; mentor < N; mentor++) {
            for (int mentee = 0; mentee < N; mentee++) {
                if (mentor == mentee) continue; // 같은 학생이면 스킵

                boolean isMentorMenteePair = true;

                // M번의 테스트에서 mentor가 mentee보다 항상 앞서야 함
                for (int i = 0; i < M; i++) {
                    if (rankings[i][mentor] >= rankings[i][mentee]) {
                        isMentorMenteePair = false;
                        break;
                    }
                }

                if (isMentorMenteePair) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
/**
4 3
3 4 1 2
4 3 2 1
3 1 4 2
 */