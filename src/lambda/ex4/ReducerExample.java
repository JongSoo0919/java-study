package lambda.ex4;

import lambda.ex3.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReducerExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + list.toString());

        System.out.println(reduce(list, 0, (value1, value2) -> value1 + value2));
        System.out.println(reduce(list, 1, (value1, value2) -> value1 * value2));

    }

    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> myReducer) {
        int result = initial;
        for (int x : list) {
            result = myReducer.apply(result, x);
        }

        return result;
    }
}
