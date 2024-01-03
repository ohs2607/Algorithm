package programmers.lv0;

/**
 한 자리 정수로 이뤄진 문자열 num_str이 주어질 때
 각 자리수의 합을 return
*/
public class StringSum {

    public static void main(String[] args) {
        StringSum ss = new StringSum();

        String str = "1000000";
        System.out.println(ss.solution(str));
    }

    public int solution(String num_str){
        int answer = 0;

        //방법1
        //Stream.of(num_str.split("")).mapToInt(Integer::parseInt).sum();

        //방법2
        for(int i=0; i<num_str.length(); i++){
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));

            //방법3
            //answer += (int)num_str.charAt(i) - 48;
        }
        return  answer;
    }
}
