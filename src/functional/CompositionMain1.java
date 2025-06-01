package functional;

import java.util.function.Function;

public class CompositionMain1 {
    public static void main(String[] args) {
        // 1. x 를 입력받아 x * x
        Function<Integer, Integer> square = x -> x * x;
        // 2. x 를 입력받아 x  + 1
        Function<Integer, Integer> add = x -> x + 1;

        // 함수 합성
        // 1. compose()를 사용한 새로운 함수 생성
        Function<Integer, Integer> newFunc1 = square.compose(add);
        // square(add(2))
        System.out.println("newFunc1 = " + newFunc1.apply(2));

        Function<Integer, Integer> newFunc2 = square.andThen(add);
        System.out.println("newFunc2 = " + newFunc2.apply(2));
    }
}
