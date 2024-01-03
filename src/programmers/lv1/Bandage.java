package programmers.lv1;

import java.util.HashMap;
import java.util.Map;

public class Bandage {

    public static void main(String[] args) {
        Bandage b = new Bandage();

        int[] bandage = {1, 1, 1};
        // 시전시간(t) , 초당회복량(x) , 추가회복량(y)
        int health = 5; // health < 0 -> 캐릭터 죽음
        int[][] attacks = {
                // 공격시간 , 피해량
                {1, 2},
                {3, 2}
        };
        System.out.println(b.solution(bandage, health, attacks));
    }

    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int time = attacks[attacks.length-1][0];
        int duration = 0;// 지속시간

        // 다차원 배열은 Map에 넣기
        Map<Integer, Integer> attackList = new HashMap<>();
        for(int[] attack : attacks){
            attackList.put(attack[0], attack[1]);
        }

        for (int i = 1 ; i <= time ; i++){
            if(attackList.containsKey(i)){
                // 공격이 있음 O
                currentHealth -= attackList.get(i); // 피해량을 현재 체력에서 뺴줌
            } else {
                // 공격 X - 따라서 붕대감기로 체력 회복
                currentHealth += bandage[1]; // 1초당 회복량을 추가
                duration++;

                // 추가 회복량을 받는 시간이 성립되면 더해주고 dutaion은 초기화
                if(duration == bandage[0]){
                    currentHealth += bandage[2];
                    duration = 0;
                }

                if(currentHealth > health){
                    currentHealth = health;
                }
            }

        }

        if(currentHealth <= 0){
            return -1;
        }
        return currentHealth;
    }
}
