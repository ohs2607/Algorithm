package programmers.lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_181878 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String myString = br.readLine();
        String pat = br.readLine();

        int answer = 0;
        boolean contains = myString.toLowerCase().contains(pat.toLowerCase());
        if (contains) answer = 1;

        System.out.println(answer);
    }
}
/*
AbCdEfG
aBc
 */