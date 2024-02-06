package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Silver_1384 { // 진행중

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int groupNum = 1;
        Map<Integer, String[]> list = new HashMap<>();

        while (true){
            int pNum = Integer.parseInt(br.readLine());
            if (pNum == 0) break;

            System.out.println("Group " + groupNum++);
            // 아 입력 순서는 앉은 순서
            // 한줄에 P와 N이 나열된 순서는 왼쪽으로 돌린 순서 (따라서 앉은 순서와 반대방향)
            // A P N P P 라면
            /* A=1, B=2, C=3, D=4, E=5 */
            // 5 4 3 2 순서로 적음 , 4가 N이며 4는 Dabby -> Debby was nasty about Ann

            for (int i=0; i<pNum; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String[] arr = new String[pNum];

                for (int j=0; j<pNum; j++){
                    arr[j] = st.nextToken();
                }
                list.put(i+1, arr);
            }

            boolean hasNasty = false;
            for (int i=0; i<pNum; i++){

                for (int j=1; j<pNum; j++){
                    if (list.get(i+1)[j].equals("N")){
                        String nPerson = "";

                        if ((i + 1) - j < 0){
                            nPerson = list.get((i + 1) - j + pNum)[0];
                        } else {
                            nPerson = list.get((i + 1) - j)[0];
                        }
                        hasNasty = true;
                        System.out.println(nPerson + " was nasty about " + list.get(i+1)[0]);
                    }
                }
            }
            if (!hasNasty){
                System.out.println("Nobody was nasty");
            }
            System.out.println();
        }
    }
}

/*
5
Ann P N P P
Bob P P P P
Clive P P P P
Debby P N P P
Eunice P P P P
6
Zheng P P P P P
Yeng P P P P P
Xiao P P P P P
Will P P P P P
Veronica P P P P P
Utah P P P P P
0

Group 1
Debby was nasty about Ann
Bob was nasty about Debby

Group 2
Nobody was nasty
*/