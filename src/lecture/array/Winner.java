package lecture.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 A, B 두 사람이 가위바위보 게임을 합니다.
 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
 B가 이기면 B를 출력합니다.
 비길 경우에는 D를 출력합니다.

 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
5
2 3 3 1 3
1 1 2 2 3
 */
public class Winner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = Integer.parseInt(sc.nextLine());
        int[] a = new int[cnt];
        int[] b = new int[cnt];

        for (int i=0; i<cnt; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i=0; i<cnt; i++){
            b[i] = Integer.parseInt(sc.next());
        }

        for (String str : solution(cnt, a, b)) {
            System.out.println(str);
        }
    }

    static List<String> solution(int cnt, int[] a, int[] b){
        List<String> winnerList = new ArrayList<>();
        // 가위-1 / 바위-2 / 보-3
        // 2 > 1 / 3 > 2 / 1 > 3

        // A가 이기는 경우만 조건을 주고 그 외에는 B가 이긴것
        for (int i=0; i<cnt; i++){
            if(a[i] == b[i]) winnerList.add("D");
            else if (a[i] == 1 && b[i] == 3) winnerList.add("A");
            else if (a[i] == 2 && b[i] == 1) winnerList.add("A");
            else if (a[i] == 3 && b[i] == 2) winnerList.add("A");
            else winnerList.add("B");
        }
        return winnerList;
    }
}
