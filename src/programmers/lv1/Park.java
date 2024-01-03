package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
    주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.

    위 두 가지중 어느 하나라도 해당된다면, 로봇 강아지는 해당 명령을 무시하고 다음 명령을 수행합니다.

    공원의 가로 길이가 W, 세로 길이가 H라고 할 때,
    공원의 좌측 상단의 좌표는 (0, 0), 우측 하단의 좌표는 (H - 1, W - 1) 입니다.
*/
public class Park {

    public static void main(String[] args) {
        Park p = new Park();

        // X가 있으면 이동 명령 무시 - park[i].contains("X") {routes 무시}
        String[] park = {"SOO", "OOO", "OOO"}; // 3x3
        String[] routes = {"E 2", "S 2", "W 1"}; // [2,1]

        String[] park2 = {"SOO", "OXX", "OOO"}; // 3x3
        String[] routes2 = {"E 2", "S 2", "W 1"}; // [0,1]

        String[] park3 = {"OSO", "OOO", "OXO", "OOO"}; // 3x4
        String[] routes3 = {"E 2", "S 3", "W 1"}; // [0,0]

        System.out.println(Arrays.toString(p.solution(park3, routes3)));
    }

    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        // routes의 공백 제거 - split함수는 입력받은 정규표현식/문자를 기준으로 문자열을 나눠 배열에 저장해 return
        List<String[]> routesArr = new ArrayList<>();
        for (int i = 0; i < routes.length; i++) {
            routesArr.add(routes[i].split(" "));
        }

        for (int i = 0; i < park.length; i++) {
            // s가 0,0에 대해 이동
            // - (x, y)에 대해 E는 x에 +1씩, s는 x -1
            // - (x, y)에 대해 W는 y에 +1씩, N는 y -1
            
            // x를 포함하면 해당 route index를 무시하도록
            if (!park[i].contains("X")) {

                System.out.println("park[i] = " + park[i]);
                System.out.println("routesArr = " + routesArr.get(i)[0]);
                System.out.println("routesArr.get(i)[1] = " + routesArr.get(i)[1]);
                System.out.println("=============================================");

                switch (routesArr.get(i)[0]) {
                    case "E":
                        answer[1] += Integer.parseInt(routesArr.get(i)[1]);
                        break;
                    case "W":
                        answer[1] -= Integer.parseInt(routesArr.get(i)[1]);
                        break;
                    case "S":
                        answer[0] += Integer.parseInt(routesArr.get(i)[1]);
                        break;
                    default:
                        answer[0] -= Integer.parseInt(routesArr.get(i)[1]);
                        break;
                }
            }

        }

        return answer;
    }
}
