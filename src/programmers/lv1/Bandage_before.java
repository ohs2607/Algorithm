package programmers.lv1;

// 모든 공격이 끝난 직후 남은 체력을 return
// 만약 몬스터의 공격을 받고 캐릭터의 체력이 0 이하가 되어 죽는다면 -1을 return 해주세요
public class Bandage_before {

    public static void main(String[] args) {
        Bandage_before b = new Bandage_before();

        int[] bandage = {5, 1, 5};
        // 시전시간(t) , 초당회복량(x) , 추가회복량(y)
        int health = 30; // health < 0 -> 캐릭터 죽음
        int[][] attacks = {
        // 공격시간 , 피해량
                {2, 10},
                {9, 15},
                {10, 5},
                {11, 5}
        };
        System.out.println(b.solution(bandage, health, attacks));
    }

    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;
        int previous = 0; // 이전 공격시간

        // 처음엔 0초 ~ 첫번째 공격시간 까지는 어차피 최대 체력이기 때문에 계산을 할 필요가 x
        for (int[] attack : attacks) {
            currentHealth -= attack[1];

            if(previous != 0){
                int attackTime = attack[0] - previous - 1;
                System.out.println("attackTime = " + attackTime);
                currentHealth += attackTime * bandage[1];
                System.out.println("currentHealth 확인: " + currentHealth);

                if(bandage[0] <= attackTime){
                    currentHealth += bandage[2];
                }
            }

            if(currentHealth > health){
                currentHealth = health;
            }

            if(currentHealth <= 0){
                return -1;
            }
            previous = attack[0];
        }


        return currentHealth;
    }
}
