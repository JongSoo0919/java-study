package lambda.ex3;

import java.util.List;

public class ReducerExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + list.toString());

        System.out.println(reduce(list, 0, (value1, value2) -> value1 + value2));
        System.out.println(reduce(list, 1, (value1, value2) -> value1 * value2));

    }

    public static int reduce(List<Integer> list, int initial, MyReducer myReducer) {
        int result = initial;
        for (int x : list) {
            result = myReducer.reduce(result, x);
        }

        return result;
    }
}
