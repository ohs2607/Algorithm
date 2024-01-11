package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
특별한 학교 이름
약칭이 주어지면 정식 명칭 출력 (정식 명칭은 미리 정보가 있다)
 */
public class Bronze_27889 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> nameInfo = new HashMap<>();
        nameInfo.put("NLCS" , "North London Collegiate School");
        nameInfo.put("BHA", "Branksome Hall Asia");
        nameInfo.put("KIS", "Korea International School");
        nameInfo.put("SJA", "St. Johnsbury Academy");

        String name = br.readLine();

        if (nameInfo.containsKey(name)){
            System.out.println(nameInfo.get(name));
        }
    }
}
