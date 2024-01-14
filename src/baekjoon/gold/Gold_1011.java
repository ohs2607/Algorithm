package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Fly me to the Alpha Centauri
각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며, x는 항상 y보다 작은 값을 갖는다.
각 테스트 케이스에 대해 x지점으로부터 y지점까지 정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 횟수를 출력한다.

이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있다
이전 작동시기에 k광년을 이동하였을 때는 k-1, k 혹은 k+1 광년만을 다시 이동할 수 있다

예를 들어, (1년) 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나
사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로
1 광년을 이동할 수 있으며, 그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다.
( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )

하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년
 */
/**
3
0 3
1 5
45 50
 */
public class Gold_1011 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        Map<Integer, Integer> points = new HashMap<>();

        for (int i=0; i<tc; i++){
            String[] loc = br.readLine().split(" ");
            points.put(Integer.parseInt(loc[0]), Integer.parseInt(loc[1]));
        }
        for (Integer i : resolve(points)) {
            System.out.println(i);
        }
    }

    static List<Integer> resolve(Map<Integer, Integer> points){
        // 최소한의 공간이동 장치 작동 횟수
        // 현재 위치가 맨 처음 시작 위치라면 음수와, 0은 해당이 없으니 무조건 1. 그리고 y지점에 도착하기 바로 직전의 이동거리는 반드시 1
        // 시작점과 도착지점을 제외한 범위의 최소 이동 횟수를 구해야함

        // 각 테스트케이스에 대한 최소이동 횟수 결과 list
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : points.entrySet()) {
            int start = entry.getKey();
            int end = entry.getValue();

            int distance = end - start;
            int cnt = 0;

            // double 타입의 인수를 전달하면 그에 대한 double 타입의 제곱근 값을 리턴 (음수는 NaN)
            int max = (int) Math.sqrt(distance);



        }


        return result;
    }
    
}
