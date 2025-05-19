package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10);

        // Collectors
        System.out.println("1. collect - List 수집");
        List<Integer> evenNumbers1 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("짝수 리스트 : " + evenNumbers1);

        // Collectors - 편의 기능
        System.out.println("2. collect - List 수집 - toList()");
        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("짝수 리스트 : " + evenNumbers2);

        System.out.println("3. toArray - 배열로 변환");
        Integer[] evenNumber3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray(Integer[]::new);
        System.out.println("짝수 배열 : " + Arrays.toString(evenNumber3));

        System.out.println("4. forEach - 각 요소 처리");
        numbers.stream()
                .limit(5)
                .forEach(System.out::print);
        System.out.println();

        System.out.println("5. count - 요소 개수");
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println(count);

        // 빈 numbers 라면 값이 없을 수도 있기에, Optional 로 제공
        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기 값이 없는 reduce");
        Optional<Integer> sum1 = numbers.stream()
                .reduce((a, b) -> a + b);
        System.out.println("합계(초기 값 없음)  " + sum1.get());

        // 초기 값이 존재한다는건 numbers가 비어있더라도 최소 값이 보장 때문에 int
        System.out.println("6. reduce - 요소들의 합");
        System.out.println("초기 값이 있는 reduce");
        int sum2 = numbers.stream()
                .reduce(100, (a, b) -> a + b);
        System.out.println("합계(초기 값 있음)  " + sum2);

        System.out.println("7. min - 최솟값");
        Optional<Integer> min = numbers.stream()
                .min(Integer::compareTo);
        System.out.println("최솟값 : " + min.get());

        System.out.println("8. max - 최댓값");
        Optional<Integer> max = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("최댓값 : " + max.get());

        System.out.println("9. findFirst - 첫 번째 요소");
        Integer first = numbers.stream()
                .filter(n -> n > 5)
                .findFirst()
                .get();
        System.out.println("5보다 큰 첫 번째 숫자 : " + first);

        // 멀티 쓰레드 상황에서, 주로 사용 (어떤 쓰레드던 하나 걸리면 가져옴, 그 외 상황에서는 거의 비슷)
        System.out.println("10. findAny - 아무 요소나 하나");
        Integer any = numbers.stream()
                .filter(n -> n > 5)
                .findAny()
                .get();
        System.out.println("5보다 큰 아무 요소 중 하나 : " +any);

        System.out.println("11. anyMatch - 조건을 만족하는 요소 존재 여부");
        boolean hasEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println("짝수가 있는가 : " + hasEven);

        System.out.println("12. allMatch - 모든 요소가 조건을 만족하는가");
        boolean allPositive = numbers.stream()
                .allMatch(n -> n > 0);
        System.out.println("모든 숫자가 양수인가 " + allPositive);

        System.out.println("13. noneMatch - 하나도 조건을 만족하지 않는지");
        boolean noNegative = numbers.stream()
                .noneMatch(n -> n < 0);
        System.out.println("음수가 없는가 : " + noNegative);
    }
}
