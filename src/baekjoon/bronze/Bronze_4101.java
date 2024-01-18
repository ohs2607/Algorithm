package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_4101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";

        while ((str = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(str);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            if (n1 == 0) break;

            if (n1 > n2) System.out.println("Yes");
            else System.out.println("No");
        }

    }
}
/*
1 19
4 4
23 14
0 0

No
No
Yes
 */