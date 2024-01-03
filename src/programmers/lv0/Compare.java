package programmers.lv0;

public class Compare {

    public static void main(String[] args) {
        Compare c = new Compare();
        System.out.println(c.solution("<", "=", 20, 50));
    }

    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if(eq.equals("=")){
            switch (ineq){
                case "<":
                    if(n<=m){
                        answer = 1;
                    }
                    break;
                default:
                    if(n>=m){
                        answer = 1;
                    }
                    break;
            }
        } else {
            if ("<".equals(ineq)) {
                if (n < m) {
                    answer = 1;
                }
            } else {
                if (n > m) {
                    answer = 1;
                }
            }
        }

        return answer;
    }
}
