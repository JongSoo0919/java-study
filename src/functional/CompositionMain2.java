package functional;

import java.util.function.Function;

public class CompositionMain2 {
    public static void main(String[] args) {
        // 1. String -> Integer
        Function<String, Integer> parseInt = Integer::parseInt;

        // 2. Integer -> String
        Function<Integer, Integer> square = x -> x * x;

        // 3. Integer -> String
        Function<Integer, String> toString = x -> "결과 : " + x;

        // compose() 혹은 andThen()으로 합성
        // parseInt -> square -> toString
        Function<String, String> finalFunc = parseInt
                .andThen(square)
                .andThen(toString);

        // 문자열 5 = 파싱 -> 제곱 -> 문자열
        String result1 = finalFunc.apply("5");
        System.out.println(result1);

        // 문자열 10
        String result2 = finalFunc.apply("10");
        System.out.println(result2);

        Function<String, Integer> stringToSquareFunc = parseInt.andThen(square);
        Integer result3 = stringToSquareFunc.apply("5");
        System.out.println("result3 = " + result3);

    }
}
