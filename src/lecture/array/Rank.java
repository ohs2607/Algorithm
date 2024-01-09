package lecture.array;

import java.util.*;

/**
 N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 */
public class Rank {

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
        int[] result = new int[n]; // 최종 순위를 담을 배열
        Map<Integer, Integer> listMap = new HashMap<>(); // 정렬 후 점수와, 등수를 함께 담기 위함

        // 복사 후 오름차순 정렬 (원본 배열을 건드리지 않는다)
        int[] copyArr = Arrays.stream(scoreArr).sorted().toArray();
        Arrays.sort(copyArr);

        // 등수 매기기 - 점수가 같은 경우 같은 등수. 하지만 그 다음 점수의 등수는 같은 등수의 인원수 밑
        for (int i=0; i<n; i++){
            listMap.put(copyArr[i], n-i); // 중복 허용이 안되기 때문에 같은 값이 있다면 제일 마지막 등수로 덮어 씌워짐
        }

        // score 배열(원본)에 들어있는 순서대로 등수 매기기
        for (int i=0; i<n; i++){
            for (Map.Entry<Integer, Integer> tmp : listMap.entrySet()) {
                if(tmp.getKey() == scoreArr[i]){
                    result[i] = tmp.getValue();
                }
            }
        }
        return result;
    }
}
/**
5
87 89 100 100 92  -> 5 4 1 1 3
*/
