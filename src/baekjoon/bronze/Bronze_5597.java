package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * X대학 M교수님은 프로그래밍 수업을 맡고 있다. 교실엔 학생이 30명이 있는데
 * 학생 명부엔 각 학생별로 1번부터 30번까지 출석번호가 붙어있다.
 * 교수님이 내준 특별과제를 28명이 제출했는데, 그 중에서
 * 제출 안 한 학생 2명의 출석번호를 구하는 프로그램을 작성하시오.
 * <p>
 * 출력은 2줄이다. 1번째 줄엔 제출하지 않은 학생의 출석번호 중 가장 작은 것, 두번째 줄은 그 다음
 */
public class Bronze_5597 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[28];
        int[] tmp = new int[31];

        for (int i = 0; i < 28; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < arr.length; i++) {
            tmp[arr[i]] = 1;
        }

        for (int i=1; i<tmp.length; i++){
            if (tmp[i] != 1){
                System.out.println(i);
            }
        }
    }
}
/*
9
30
6
12
10
20
21
11
7
5
28
4
18
29
17
19
27
13
16
26
14
23
22
15
3
8
24
25
 */