package lecture.hash_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/*
Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
*/
public class Anagram_2 {

    public static void main(String[] args) throws IOException {
        // 동일한 문자들과 그 개수들까지 일치하면 아나그램 (길이가 같음)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println(solution(str1, str2));
    }

    static String solution(String str1, String str2){
        String answer = "YES";

        // 2. HashMap으로 풀기
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str1.toCharArray()) {
            // map에 첫번째 단어와 등장 횟수(비교기준) 담기 - 순서가 상관없고 구성만 같으면 되니 갯수로 확인
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        for (char x : str2.toCharArray()) {
            // 해당 문자가 맵에 있는지 없는지, 키가 있다면 횟수를 하나 감소
            /* value가 0인데 해당 if문을 들어왔다는 것은 기준 문자열안의 해당 문자 갯수보다
               두번째 문자열의 해당 문자 갯수가 더 많다는 것
               따라서 바로 종료
            */
            if(!map.containsKey(x) || map.get(x) == 0){
                return "NO";
            }
            map.put(x, map.get(x)-1);
        }
        return answer;
    }
}
/*
AbaAeCe
baeeACA
*/