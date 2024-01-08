package lecture.array;

import java.util.*;

/**
 N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

5
87 89 92 100 76

4 3 2 1 5
 */
public class Rank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scoreArr = new int[n];

        for (int i=0; i<n; i++){
            scoreArr[i] = sc.nextInt();
        }

        System.out.println(solution(n, scoreArr).toString());
    }

    static Map<Integer, Integer> solution(int n, int[] scoreArr){
        Map<Integer, Integer> listMap = new HashMap<>();

        // 오름차순 정렬
        Arrays.sort(scoreArr);

        // 등수 매기기 - 점수가 같은 경우 같은 등수. 하지만 그 다음 점수의 등수는 같은 등수의 인원수 밑
        for (int i=0; i<n; i++){
            listMap.put(i+n-1, scoreArr[i]);
        }

        return listMap;
    }
}
