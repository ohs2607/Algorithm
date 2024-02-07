package lecture.hash_tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
*/
public class Hash_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Character, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        /* map의 value로 정렬하기 */
        // 1. key값으로 새로운 리스트를 만듦.
        ArrayList<Character> keys = new ArrayList<>(map.keySet());

        // 2. 정렬을 하는데, 키값으로 value를 비교한다
        // 역순 비교를 위해 1,2를 역순으로 둠
        Collections.sort(keys, (v2, v1) -> (map.get(v1).compareTo(map.get(v2))));

        // 역순정렬이니 제일 많은것이 제일 첫번째에 옴
        System.out.println(keys.get(0));
    }
}
/*
15
BACBACCACCBDEDE

b3
a3
c5
d2
e2
*/