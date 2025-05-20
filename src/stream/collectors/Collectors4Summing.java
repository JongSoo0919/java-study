package stream.collectors;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4Summing {
    public static void main(String[] args) {
        // 개수
        Long count1 = Stream.of(1, 2, 3)
                .collect(Collectors.counting());
        System.out.println(count1);

        long count2 = Stream.of(1, 2, 3, 4)
                .count();
        System.out.println(count2);

        Double average1 = Stream.of(1, 2, 2)
                .collect(Collectors.averagingInt(i -> i));
        System.out.println(average1);

        // 기본형 특화 스트림 변환
        double average2 = Stream.of(1, 2, 2)
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
        System.out.println(average2);

        // 기본형 특화 스트림
        double average3 = IntStream.of(1, 2, 2)
                .average()
                .getAsDouble();
        System.out.println(average3);

        // 통계
        IntSummaryStatistics stats1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.summarizingInt(String::length));
        System.out.println(stats1.getCount());
        System.out.println(stats1.getSum());
        System.out.println(stats1.getMin());
        System.out.println(stats1.getMax());
        System.out.println(stats1.getAverage());
    }
}
