package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4Reducing {
    public static void main(String[] args) {
        List<String> names = List.of("a", "b", "c", "d");

        // Collection의 Reducing은 주로 다운 스트림에 활용
        String joined1 = names.stream()
                .collect(Collectors.reducing(
                        (s1, s2) -> s1 + "," + s2
                )).get();
        System.out.println(joined1);

        String joined2 = names.stream()
                .reduce((s1, s2) -> s1 + "," + s2)
                .get();
        System.out.println(joined2);


        // 문자열 전용 기능
        String joined3 = names.stream()
                .collect(Collectors.joining(","));
        System.out.println(joined3);

        // String 객체 자체가 제공
        String joined4 = String.join(",", "a", "b", "c", "d");
        System.out.println(joined4);
    }
}
