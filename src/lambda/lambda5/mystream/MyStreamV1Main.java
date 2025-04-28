package lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {
    public static void main(String[] args) {
        // 짝수만 남기고, 남은 값의 2배를 반환
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        returnValue(numbers);
        methodChain(numbers);
    }

    private static void methodChain(List<Integer> numbers) {
        List<Integer> list = new MyStreamV1(numbers)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .toList();

        System.out.println(list);
    }

    private static void returnValue(List<Integer> numbers) {
        MyStreamV1 stream = new MyStreamV1(numbers);
        MyStreamV1 filter = stream.filter(x -> x % 2 == 0);
        MyStreamV1 map = filter.map((n -> n * 2));
        System.out.println(map.toList());

    }
}
