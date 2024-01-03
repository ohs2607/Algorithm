package lecture.string;

import java.util.Scanner;

/* 한 개의 문자열 s와 문자 t가 주어지면
   문자열 s의 각 문자가
   문자 t와 떨어진 최소거리를 출력하는 프로그램 */
/** teachermode e -> 1 0 1 2 1 0 1 2 2 1 0 */
public class StrDistance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        for (int i : solution(str, c)) {
            System.out.print(i + " ");
        }
    }

    static int[] solution(String str, char c){
        int[] distanceArr = new int[str.length()];
        int p = 1000; // 어차피 뒤집어 씌워질 값이니 0이 아닌 다른 값으로 설정해둠

        /* 왼쪽의 문자를 기준으로 한 거리, 오른쪽 문자를 기준으로 한 거리를 비교해서 더 짧은걸 선택해야 함 */
        // 주어진 문자와의 '최소거리'임을 주의

        // 1. 왼쪽 문자 기준으로 비교
        for (int i=0; i<str.length(); i++){
            // 해당 index의 요소와 주어진 문자가 같다면 0 반환
            if(str.charAt(i) == c) p = 0;
            else p++;
            distanceArr[i] = p;
        }

        // 2. 오른쪽 문자 기준으로 비교 (뒤에서부터 앞으로)
        p = 1000; // p 초기화
        for (int i=str.length()-1; i>=0; i--){
            if(str.charAt(i) == c)   p = 0;
            else {
                p++;
                // p를 배열에 넣어줄 떄 비교가 필요.
                // 기존 배열의 값과 새로운 p를 비교해서 최소거리니까 지금 p가 더 작다면 배열에 새로 저장
                //if(distanceArr[i] > p){
                //    distanceArr[i] = p;
                //}
                // 위에서 if문으로 비교하는거 말고 Math의 min 메서드를 사용하면 된다.
                // min 함수는 2개의 인자중에서 더 작은 값을 return 해줌
                distanceArr[i] = Math.min(distanceArr[i], p);

            }
        }
        return distanceArr;
    }

}
