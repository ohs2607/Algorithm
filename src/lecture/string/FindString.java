package lecture.string;

import java.io.IOException;
import java.util.Scanner;

/**
 Computercooler
 c
 */
public class FindString {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ch = sc.next();

        System.out.println(resolve(str, ch));
    }

    static public int resolve(String str, String ch){
        int count = 0;
        char c = Character.toLowerCase(ch.charAt(0));

        for (char word : str.toCharArray()) {
            if(c == Character.toLowerCase(word)) count++;
        }
        return count;
    }
}
