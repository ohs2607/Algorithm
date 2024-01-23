package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 다리놓기 (nCr - 조합 사용 문제 : 서로다른 n개에서 r개를 뽑는다)

강 주변에서 다리를 짓기에 적합한 곳을 사이트라고 한다.
강의 서(왼)쪽에는 N개의 사이트가 있고 동쪽에는 M개의 사이트가 있다는 것을 알았다. (N ≤ M)
서쪽의 사이트와 동쪽의 사이트를 다리로 연결하려고 한다.
(이때 한 사이트에는 최대 한 개의 다리만 연결될 수 있다.) 재원이는 다리를 최대한 많이 지으려고 하기 때문에
서쪽의 사이트 개수만큼 (N개) 다리를 지으려고 한다.
다리끼리는 서로 겹쳐질 수 없다고 할 때 다리를 지을 수 있는 경우의 수를 구하는 프로그램을 작성하라.
 */
public class Silver_1010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());


        // nCr -> nC0이거나, nCn이라면 항상 1
        /* mCn (m >= n) */
        for (int i=0; i<tc; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == m || n ==0) System.out.println(1);


        }


    }

}
/*
3
2 2
1 5
13 29

1 (다리가 서로 겹쳐질 수 없기 때문에 일자로 2개의 다리가 생기는 1가지 경우만 가능)
5
67863915
 */