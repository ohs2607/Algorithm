package programmers.skill_check;

public class Paint {

    public static void main(String[] args) {
        Paint p = new Paint();
        int n = 4, m = 1;
        int[] section = {1, 2, 3, 4};

        System.out.println(p.solution(n, m, section));
    }

    public int solution(int n, int m, int[] section){
        int answer = 0;
        int finishArea = 0;

        for(int i = 0; i<section.length; i++){
            // 2부터면 전체 8에서 -> 2~5까지 (2+m-1)
            // section 첫번쨰요소의 다음 값들이 (2+m-1)보다 작으면 answer 한번 추가한채로 넘어가고
            // 크다면 answer 에 한번 더 ++
            //section[i] + m -1 // 여기까지가 첫번쨰로 칠해지는 영역

            if(i == 0){
                finishArea = section[i] + m -1;
                answer++;
            }

            if(section[i] > finishArea){
                // 두번쨰 구역부터 처음 칠해지는 영역보다 작으면 넘어가고 크면 answer 에 하나 더함
                answer++;
            }
        }

        return answer;
    }
}
