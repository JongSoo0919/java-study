package stream.operation;

import java.util.Collections;
import java.util.List;

public class IntermediateOperationsMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // 1. filter
        System.out.println("1. filter - 짝수만 선택");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // 2. map
        System.out.println("2. map - 각 숫자를 제곱");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        // 3. distinct
        System.out.println("3. distinct - 중복 제거");
        numbers.stream()
                .distinct()
                .forEach(System.out::println);

        // 4. sorted (기본 정렬)
        System.out.println("4. 정렬");
        numbers.stream()
                .sorted((o1, o2) -> o2 - o1)
                .forEach(System.out::println);

        // 5. peek - 중간 연산 사이에 peek을 넣음으로써 값의 변화를 확인이 가능
        System.out.println("5. peek - 동작 확인용");
        numbers.stream()
                .peek(n -> System.out.print("before: " + n + ", "))
                .map(n -> n * n)
                .peek(n -> System.out.print("after: " + n + ", "))
                .limit(5)
                .forEach(n -> System.out.println("최종 값: " + n + ", "));
        System.out.println();

        // 6. limit
        System.out.println("6. limit - 처음 몇 개 요소만");
        numbers.stream()
                .limit(5)
                .forEach(System.out::println);

        // 7. skip
        System.out.println("7. skip - 처음 몇 개 요소를 건너뜀");
        numbers.stream()
                .skip(5)
                .forEach(System.out::println);

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 1, 2, 3, 6);

        //8. takeWhile (Java 9+)
        System.out.println("8. takeWhile - 5보다 작은 동안만 선택 - 처음 해당 값을 만난 경우(조건을 만족한 경우), 그 다음은 진행하지 않음." );
        numbers2.stream()
                .takeWhile(n -> n < 5)
                .forEach(System.out::println);

        //9. dropWhile (Java 9+)
        System.out.println("9. dropWhile - 5보다 작은 동안 건너뛰기 - 그 뒤 수가 무한대면 무한대로 진행");
        numbers2.stream()
                .dropWhile(n -> n < 5)
                .forEach(System.out::println);
    }
}
