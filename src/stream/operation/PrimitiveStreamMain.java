package stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreamMain {
    public static void main(String[] args) {
        // 기본형 특화 스트림 생성(IntStream, LongStream, DoubleStream)
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 범위 생성 메서드 (IntStream, LongStream)
        IntStream range1 = IntStream.range(1, 6); // [1,2,3,4,5]
        range1.forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream range2 = IntStream.rangeClosed(1, 6); // [1,2,3,4,5,6]
        range2.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 1. 통계 관련 메서드 (sum, average, max, min, count)
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        // average : 평균
        double average = IntStream.range(1, 6).average().getAsDouble();
        System.out.println("average = " + average);

        // summaryStatistics() : 모든 통계 정보
        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println("합계 " + stats.getSum());
        System.out.println("평균 " + stats.getAverage());
        System.out.println("최대값 " + stats.getMin());
        System.out.println("최소값 " + stats.getMin());
        System.out.println("개수 " + stats.getCount());

        // 2. 타입 변환 메서드
        // IntStream -> LongStream
        LongStream longStream = IntStream.range(1, 5).asLongStream();
        DoubleStream doubleStream = IntStream.range(1, 5).asDoubleStream();
        // IntStream -> Stream<Integer>
        Stream<Integer> boxed = IntStream.range(1, 5).boxed();

        // 3. 기본형 특화 매핑
        // int -> long
        LongStream longStream1 = IntStream.range(1, 5)
                .mapToLong(i -> i);
        // int -> double
        DoubleStream doubleStream1 = IntStream.range(1, 5)
                .mapToDouble(i -> i);
        // int -> 객체 변환 매핑
        Stream<String> stringStream = IntStream.range(1, 5)
                .mapToObj(String::valueOf);

        // 4. 객체 스트림 -> 기본형 특화 스트림 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        // 기본형 특화 스트림의 함수를 사용하기 위해
        IntStream intStream = integerStream.mapToInt(i -> i);

        // 5. 객체 스트림 -> 기본형 특화 스트림으로 매핑 활용
        int sum1 = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(i -> i)
                .sum();
        System.out.println("sum1 = " + sum1);

    }
}
