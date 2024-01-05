package programmers.skill_check;

// 벽 전체 길이 -> m
// 롤러의 길이  -> n
// section    -> 칠해야할 구역
public class Paint {

    public static void main(String[] args) {
        Paint p = new Paint();
        int n = 4, m = 1;
        int[] section = {1, 2, 3, 4};

        System.out.println(p.solution(n, m, section));
    }

    public int solution(int n, int m, int[] section){
        int answer = 0;
        // 전체 n에서 section에 있는 구역이 나오면 비교
        // 벽길이는 1 ~ n
        for(int i = 1; i<=n; i++){

        }

        return answer;
    }
}
