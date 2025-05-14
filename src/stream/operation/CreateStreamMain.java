package stream.operation;

import java.util.List;
import java.util.stream.Stream;

public class CreateStreamMain {
    public static void main(String[] args) {
        System.out.println("1. 컬렉션으로부터 생성");
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        System.out.println("2. 배열로부터 생성");
        String[] arr = {"a", "b", "c", "d", "e", "f", "g"};
        Stream<String> stream2 = Stream.of(arr);
        stream2.forEach(System.out::println);

        System.out.println("3. Stream.of() 사용");
        Stream<String> stream3 = Stream.of("a", "b", "c", "d", "e", "f", "g");
        stream3.forEach(System.out::println);

        System.out.println("4. 무한 스트림 생성 - iterate()");
        // iterate : 초기 값과 다음 값을 만드는 함수를 지정
        // seed : 초기 값 UnaryOperator : 인자와, 리턴 값이 같은 람다
        Stream<Integer> infiniteStream = Stream.iterate(0, n -> n + 2);
//        infiniteStream.forEach(System.out::println); // 무한대로 계속 출력
        infiniteStream.limit(5).forEach(System.out::println);

        System.out.println("5. 무한 스트림 생성 - generate");
        // generate : Supplier 사용하여 무한하게 생성
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.limit(5).forEach(System.out::println);
    }
}
