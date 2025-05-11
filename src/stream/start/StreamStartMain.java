package stream.start;

import java.util.List;
import java.util.stream.Stream;

public class StreamStartMain {
    public static void main(String[] args) {
        List<String> names = List.of("Apple", "Banana", "Berry", "Tomato");

        //B로 시작하는 이름만 필터 후 리스트 수집
        Stream<String> stream = names.stream();
        List<String> result = stream
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .toList();

        // 외부 반복
        for (String name : result) {
            System.out.println(name);
        }

        // 내부 반복 (foreach)
        names.stream()
                .filter(name -> name.startsWith("B"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
