package programmers.lv0;

import java.util.stream.IntStream;

/** 첫번째로 나오는 음수의 index를 return하기
 * 음수가 없다면 -1 return
 * */
public class FirstNegativeNumber {

    public static void main(String[] args) {
        FirstNegativeNumber num = new FirstNegativeNumber();

        //int[] num_list = new int[]{12, 4, 15, 46, 38, -2, 15}; // index 는 5
        int[] num_list = new int[]{13, 22, -53, 24, -15, 6}; // 음수가 없기때문에 -1

        System.out.println(num.solution(num_list));
    }

    public int solution(int[] num_list){
        int answer = 0; // 아예 answer의 초기값을 -1로 두는것도 방법

        /* 1. 복잡하게 품
        boolean checkNegativeArr = false; // 이걸 쓰지 않고 그냥 음수를 if문에서 찾으면 바로 return하면 됨
        for(int i = 0; i<num_list.length; i++){
            if(num_list[i] < 0 && !checkNegativeArr) {
                answer = i;
                checkNegativeArr = true;
            }
        }
        if(!checkNegativeArr){
            answer = -1;
        }*/

        // 2. IntStream 사용하기 - range는 종료값을 포함하지 않음
        answer = IntStream
                    .range(0, num_list.length)
                    .filter(i -> num_list[i] < 0)
                    .findFirst()
                    .orElse(-1);

        return answer;
    }
}
