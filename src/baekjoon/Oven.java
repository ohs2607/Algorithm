package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Oven {
    /**
     * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
     * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리훈제 재료를 오븐에 넣으면 된다.
     * 그러면 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
     * 또한, KOI오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려주는 디지털 시계가 있다.
     * 훈제 오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을떄

     * 오븐구이가 "끝나는 시각을 계산"하는 프로그램을 작성
     */

    public static void main(String[] args) throws IOException {
        Oven code = new Oven();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        System.out.println(code.solution(hour, minute, time));
    }

    public String solution(int hour, int minute, int time){

        /** 방법1. 조건을 일일이 다 둔다 (비효율)
        if(time >= 60){
            hour += time/60;
            minute += time%60;

            if(minute >= 60){
                hour++;
                minute = minute-60;
            }
        } else{
            if(minute + time >= 60){
                hour++;
                minute = minute + time - 60;
            } else {
                return hour + " " + (minute+time);
            }
        }
        if(hour >= 24){
            hour -= 24;
        }*/

        /** 방법2. 시를 분으로 바꿔서 계산한다 */
        int changeTime = hour*60 + minute + time;

        hour = (changeTime/60) % 24;
        minute = changeTime % 60;

        return hour + " " + minute;
    }
}
