package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class Players {
/*
    선수들의 이름이 1등부터 현재 등수 순서대로 담긴 문자열 배열 players와
    해설진이 부른 이름을 담은 문자열 배열 callings가 매개변수로 주어질 때,
    경주가 끝났을 때 선수들의 이름을 1등부터 등수 순서대로 배열에 담아 return

    (1등인 선수이름은 불리지 x, player에는 중복 x)
*/
    public static void main(String[] args) {
        Players player = new Players();

        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"}; // 이렇게 되면 mumu, kai, mine, soe, poe 순서

        String[] answer = player.solution(players, callings);

        for(String str : answer){
            System.out.print(str + ", ");
        }
    }

    public String[] solution(String[] players, String[] callings){
        /* 2중 for문은 시간이 너무 오래걸림
        for(int i=0;i<callings.length;i++){
            for(int j=0;j< players.length;j++){
                if(players[j].equals(callings[i])){
                    String temp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = temp;
                }
            }
        }*/

        // 2. map으로
        Map<String, Integer> list = new HashMap<>();
        for(int i=0;i<players.length;i++){
            list.put(players[i], i);
        }

        for(String calling : callings){
            // 1등은 불리지 않음
            int rank = list.get(calling);
            String temp = players[rank-1];

            players[rank-1] = players[rank];
            players[rank] = temp;

            // map자리도 수정
            list.put(calling, rank-1); // 앞에있던 애를 뒤로
            list.put(temp, rank); // 뒤에있던 애를 앞으로
        }

        return players;
    }
}
