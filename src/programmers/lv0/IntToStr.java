package programmers.lv0;

public class IntToStr {

    public static void main(String[] args) {
        IntToStr i = new IntToStr();
        System.out.println(i.solution(9, 91));
    }
    public int solution(int a, int b) {
        int answer = 0;

        int r1 = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int r2 = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        answer = r1==r2 ? r1 : (r1>r2 ? r1 : r2);

        /*
            더 간결한 풀이
            Math.max() 함수는 입력값으로 받은 0개 이상의 숫자 중 가장 큰 숫자를 반환
        */
        //return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));

        return answer;
    }
}
