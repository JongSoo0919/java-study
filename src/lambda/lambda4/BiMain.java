package lambda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(1, 5));

        BiConsumer<String, Integer> repeat = (string, integer) -> {
            for(int i = 0; i < integer; i++) {
                System.out.print(string);
            }
            System.out.println();
        };

        repeat.accept("hello", 5);
        BiPredicate<Integer, Integer> is = (a, b) -> a > b;
        System.out.println(is.test(5, 7));

    }
}
