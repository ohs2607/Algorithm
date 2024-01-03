package programmers.lv0;

public class OverlapStr {

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        /*
            1. my_string의 index s부터 overwrite문자열 길이와 s가 더해진 만큼의 index까지의 문자열 부분을 추출
            String substring = my_string.substring(s, s + overwrite_string.length());// 7~13인데 끝은 미포함이라 14

            2. 추출한 부분을, overwrite 문자열로 전부 대체
            answer = my_string.replaceAll(substring, overwrite_string);

            -> 테스트6 에러발생
               : index s부터 자른 문자열이 기존 my_string에 여러개 있다면 모두 대체되어 버림.
               (예를들어 string12ng12가 기존 문자열이고, s는 4, 겹치려는 문자열이 hi34일 경우 추출된 문자열은 ng12
               기존문자열의 ng12를 모두 hi34로 대체한다는 말이 되는데, 기존문자열에서 ng12는 2개 존재하므로 원하는 결과를 얻지 못함
               strihi34ng12 (원하는 결과)
               strihi34hi34 (출력된 결과)

               이를 해결하기 위해서 replace를 사용하지 않음 X
         */

        String first = my_string.substring(0,s); // 변하지 않는 부분
        String last = my_string.substring(s+overwrite_string.length());

        answer = first + overwrite_string + last;
        return answer;
    }

    public static void main(String[] args) {
        OverlapStr os = new OverlapStr();
        //String result = os.solution("Program29b8UYP", "merS123", 7);
        String result = os.solution("He11oWor1d", "lloWorl", 2);
        System.out.println(result);
    }
}
