package programmers.lv1;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Photo {

    public static void main(String[] args) {
        Photo p = new Photo();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearing = {5, 10, 1, 3};
        String[][] photo = {
                    {"may", "kein", "kain", "radi"},
                    {"may", "kein", "brin", "deny"},
                    {"kon", "kain", "may", "coni"}
                };

        System.out.println(Arrays.toString(p.solution(name, yearing, photo)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        String nameByPhoto = "";

        Map<String, Integer> list = new LinkedHashMap<>();
        for(int i=0;i< name.length;i++){
            list.put(name[i], yearning[i]);
        }

        for(int i=0;i<photo.length;i++){
            for(int j=0;j<photo[i].length;j++){
                nameByPhoto = photo[i][j];
                if(list.get(nameByPhoto) != null){
                    answer[i] += list.get(nameByPhoto);
                }
            }
        }
        return answer;
    }

}
