package lecture.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeLetterCase {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(resolve(str));
    }

    static public String resolve(String str){
        String result = "";
        for (char c : str.toCharArray()) {
            result += Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
        }
        return result;
    }
}
