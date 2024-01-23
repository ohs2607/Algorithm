package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* 메세지
    아이들은 원형으로 앉은 뒤 종이 위에 자신의 이름을 적습니다.
    다음 각자의 종이를 자기 왼편으로 전달합니다.
    종이를 전달받았으면, 종이 맨 위에 쓰인 이름을 가진 아이에 대해 좋은 메시지를 써줍니다.
    메시지는 종이 아래쪽에 적으며, 적은 뒤에는 종이를 접어 가립니다.
    다음으로 종이를 왼편으로 넘기고 같은 활동을 반복합니다.
    자신의 이름이 맨 위에 적힌 종이를 받으면 활동을 종료
 */
// 아이들의 수 -> n
public class Silver_1384 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int groupNum = 1;

        while ((str = br.readLine()).charAt(0) != '0'){
            Map<Integer, String> map = new HashMap<>();
            Map<Integer, String> result = new HashMap<>();
            int person = Integer.parseInt(str);
            int pNum = 1;

            for (int x=0; x<person; x++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String[] arr = new String[person];

                for (int i=0; i<person; i++){
                    arr[i] = st.nextToken();
                    if (i == 0) {
                        map.put(pNum++, arr[i]);
                    }
                }
                System.out.println(Arrays.toString(arr));
                for (int i=0; i<person; i++){
                    // 1~5라고 하면, 왼쪽사람이고, Ann이 1일때 빼줘야해, 두번째가 N이면 1-2 = -1인데 데비는 4번. 여기에 인원수를 더하면 되나..? (아 음수면?)
                    // 데비가 bob한테 욕먹었는데, 데비는 4 4-2 = 2
                    if (arr[i].equals("N")) {
                        // 욕한사람 자리, 욕먹은사람
                        result.put(i+2, arr[0]);
                    }
                }

            }
            System.out.println(map.toString());
            System.out.println(result.toString());


            String name = "";
        }
    }


}
