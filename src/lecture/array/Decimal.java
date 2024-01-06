package lecture.array;

import java.util.Scanner;

/* 에라토스테네스체 */
public class Decimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }

    static int solution(int num){
        int cnt=0;
        int[] ch = new int[num+1]; // num이 10이라면 index 10을 쓰기 위해서

        for(int i=2; i<=num; i++){
            // 두번째 for문에 의해서 배수가 되는 숫자의 요소 값은 1인 상태. 따라서 if문을 지나침
            if(ch[i]==0){
                cnt++;

                // 전체 범위 안에서 해당 숫자의 배수가 있으면 1
                for(int j=i; j<=num; j=j+i) {
                    ch[j]=1;
                }
            }
        }
        return cnt;
    }
}
