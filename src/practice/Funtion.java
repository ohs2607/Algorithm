package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Funtion {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

        String result = words.stream()
                        .filter(w -> w.length() > 1)
                        .map(String::toUpperCase)
                        .map(w -> w.substring(0, 1))
                        .collect(Collectors.joining(" "));

        System.out.println("result = " + result);
        //result = T H A N K

        Function<String, String> function = word -> word.toUpperCase();
        String text = function.apply("text");
        System.out.println("text = " + text);
        // text = TEXT

        // Steam API
        String[] nameArr = {"Mike", "Jane", "James"};
        List<String> nameList = Arrays.asList(nameArr);

        //Arrays.sort(nameArr); // 원본배열이 정렬된다
        //Collections.sort(nameList); // 원본 list객체가 정렬된다

        // 원본 데이터를 별도의 Stream으로 복사해서 생성
        Stream<String> arrayStream = Arrays.stream(nameArr);
        Stream<String> nameStream = nameList.stream();

        // 복사된 데이터를 정렬하여 출력
        arrayStream.sorted().forEach(System.out::println);
        nameStream.sorted().forEach(System.out::println);


        System.out.println("원본 데이터 확인해보기");
        for (String name : nameArr){
            System.out.println(name);
        }
        for (String name : nameList){
            System.out.println(name);
        }

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        long c = myList.stream()     // 생성하기
                .filter(i -> i.startsWith("c")) // 가공하기
                .map(String::toUpperCase) // 가공하기
                .sorted() // 가공하기
                .count();// 결과 만들기
        System.out.println(c);


        // findAny, findFirst
        List<String> elements = Arrays.asList("a", "a1", "b", "b1", "c", "c1");

        Optional<String> firstCheckElements = elements.stream()
                .filter(e -> e.startsWith("b"))
                .findFirst();
        System.out.println("firstCheckElements = " + firstCheckElements.get());
        // get없이 그냥 출력하면 firstCheckElements = Optional[b]
        // get으로 출력하면 b

        Optional<String> first = elements.stream()
                .findAny();
        System.out.println(first.get());
    }
}
