package programmers.lv0;

public class ShuffleStr {

    public static void main(String[] args) {
        ShuffleStr shuffle = new ShuffleStr();
        System.out.println(shuffle.solution("aaaaa", "bbbbb"));
    }

    public String solution(String str1, String str2) {
        // 두 문자열의 각 문자가 앞아서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return
        String answer = "";

        // 문자열을 char 배열로 (또는 그냥 charAt()으로도 가능)
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        for (int i = 0; i < str1.length(); i++) {
            answer += charArr1[i];
            answer += charArr2[i];
        }
        return answer;
    }

}
