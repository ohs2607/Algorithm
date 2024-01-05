package lecture.array;

import java.util.Scanner;

public class Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }

    static int solution(int num){
        int cnt=0;
        int[] ch = new int[num+1];

        for(int i=2; i<=num; i++){
            if(ch[i]==0){
                cnt++;

                for(int j=i; j<=num; j=j+i) {
                    ch[j]=1;
                }
            }
        }
        return cnt;
    }
}
