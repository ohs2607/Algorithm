package programmers.lv3;

import java.util.Arrays;

public class Sequence {

    public static void main(String[] args) {
        Sequence s = new Sequence();
        int[] sequence = {2, 3, -6, 1, 3, -1, 2, 4};

        System.out.println(s.solution(sequence));
    }

    public long solution(int[] sequence) {
        long answer = 0;
        int[] temp = new int[sequence.length];

        int max = temp[0];
        int idx = 0;

        // 1. 들어온 정수 배열에 대해 절대값을 적용한다
        for(int i=0;i<temp.length;i++){
            temp[i] = Math.abs(sequence[i]);

            // 2. 절대값이 된 숫자 중 max를 구하고 그 index를 구한다
            if(temp[i] > max){
                max = temp[i];
                idx = i;
            }
        }

        // 3. max값의 양 옆으로 합을 구한다
        int leftSum = 0;
        int rightSum = 0;

        for(int i=0;i<idx;i++){
            leftSum += sequence[i];
        }
        for(int i=idx;i< sequence.length;i++){
            rightSum += sequence[i];
        }

        if(leftSum > rightSum){

        } else {

        }


        return answer;
    }
}
