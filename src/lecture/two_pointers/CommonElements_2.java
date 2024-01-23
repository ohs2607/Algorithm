package lecture.two_pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
    A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력
*/
public class CommonElements_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] aArr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<a; i++){
            aArr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());
        int[] bArr = new int[b];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i=0; i<b; i++){
            bArr[i] = Integer.parseInt(st2.nextToken());
        }

        for (Integer i : solution(a, b, aArr, bArr)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> solution(int a, int b, int[] aArr, int[] bArr){
        ArrayList<Integer> answer = new ArrayList<>();

        // 두개의 포인터를 둔다
        int p1 = 0, p2 = 0;

        // 배열을 먼저 오름차순 정렬로 바꾼다
        Arrays.sort(aArr);
        Arrays.sort(bArr);

        // 비교 후 값이 더 작은 쪽의 p1을 증가시킨다. (왜냐면 모두 오름차순 정렬된 상태이니 더 작은 수라면 앞으로 더 안나올테니까)
        while (p1 < a && p2 < b){
            if (aArr[p1] < bArr[p2]){
                p1++;
            } else if(aArr[p1] > bArr[p2]){
                p2++;
            } else {
                answer.add(aArr[p1]);
                p1++;
                p2++;
            }
        }
        return answer;
    }
}
/*
5
1 3 9 5 2
5
3 2 5 7 8
*/