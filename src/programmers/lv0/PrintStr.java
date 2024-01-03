package programmers.lv0;

import java.io.*;
import java.util.Scanner;

/** 단순 문자열 입출력 */
public class PrintStr {

    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.flush();
    }
}
