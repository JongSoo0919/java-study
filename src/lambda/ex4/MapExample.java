package lambda.ex4;

import lambda.ex2.MyFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + list);

        System.out.println(map(list, (value) -> value.toUpperCase()));
        System.out.println(map(list, (value) -> "***"+value+"***"));
    }

    public static List<String> map(List<String> list, UnaryOperator<String> function) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            String s = function.apply(str);
            result.add(s);
        }

        return result;
    }
}
