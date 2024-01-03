package programmers.lv0;

import java.util.Scanner;

public class Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuilder result = new StringBuilder();

        for(int i=0;i<a.length();i++){
            char fromA = a.charAt(i);

            if(Character.isLowerCase(fromA)){
                result.append(Character.toUpperCase(fromA));
            } else {
                result.append(Character.toLowerCase(fromA));
            }
        }
        System.out.println(result);
    }
}
