package programmers.lv1;

public class SplitString {

    public static void main(String[] args) {
        SplitString split = new SplitString();
        String s = "aaabbaccccabba";
        System.out.println(split.solution(s));
    }

    public int solution(String s){
        int answer = 1;
        char x = s.charAt(0);
        String temp;

        int countX = 0;
        int countNotX = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == x){
                countX++;
            } else {
                countNotX++;
            }

            if(countX == countNotX){
                if(i+1 == s.length()){
                    break;
                }
                temp = s.substring(i+1, s.length());
                x = temp.charAt(0);
                answer++;
            }
        }

        return answer;
    }
}
