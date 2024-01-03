package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** 사진별로 추억 점수 매기기
 * 사진속에 나오는 인물의 그리움 점수를 모두 합산한 값이 해당 사진의 추억점수
 * yeqring은 각 인물의 그리움 점수
 */
public class MemoryScore {

    public static void main(String[] args) {
        MemoryScore m = new MemoryScore();

        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {
                {"may", "kein", "kain", "radi"},
                {"may", "kein", "brin", "deny"},
                {"kon", "kain", "may", "coni"}
        };
        System.out.println(Arrays.toString(m.solution(name, yearning, photo)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] answer = new int[photo.length];

        Map<String, Integer> memberScore = new HashMap<>();
        for(int i=0;i<name.length;i++){
            memberScore.put(name[i], yearning[i]);
        }

        for(int i=0;i<photo.length;i++){
            for (int j=0;j<photo[i].length;j++){

                if(memberScore.containsKey(photo[i][j])){
                    answer[i] += memberScore.get(photo[i][j]);
                }
            }
        }

        return answer;
    }

}
