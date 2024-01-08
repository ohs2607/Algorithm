package baekjoon.bronze;

// 이 별은 무슨 색일까
/*
기계장치에는 별이 담겨있고 내부는 볼 수 없어서 별은 보지 못한다.
기계장치에는 별빛의 파장을 알려주는 계기판이 있다.
계기판에 표시된 파장의 값을 토대로 별의 색을 알아낼 수 있다.
*/

import java.util.Scanner;

/**
색상별 파장의 범위는 다음과 같다.

빨간색: 620nm 이상 780nm 이하
주황색: 590nm 이상 620nm 미만
노란색: 570nm 이상 590nm 미만
초록색: 495nm 이상 570nm 미만
파란색: 450nm 이상 495nm 미만
남색: 425nm 이상 450nm 미만
보라색: 380nm 이상 425nm 미만
*/
public class Bronze_30676 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(resolve(sc.nextInt()));
    }

    static String resolve(int length){
        String color = "";

        if (length >= 620 && length <= 780){
            color = "Red";
        } else if (length >= 590 && length < 620) {
            color = "Orange";
        } else if (length >= 570 && length < 590) {
            color = "Yellow";
        } else if (length >= 495 && length < 570) {
            color = "Green";
        } else if (length >= 450 && length < 495) {
            color = "Blue";
        } else if (length >= 425 && length < 450) {
            color = "Indigo";
        } else if (length >= 380 && length < 425) {
            color = "Violet";
        }
        return color;
    }
}
