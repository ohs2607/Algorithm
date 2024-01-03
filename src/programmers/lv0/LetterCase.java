package programmers.lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterCase {

    public static void main(String[] args) throws IOException {
        String result = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(char word : str.toCharArray()){
            result += Character.isLowerCase(word) ? Character.toUpperCase(word) : Character.toLowerCase(word);
        }
        System.out.println(result);
    }
}
