package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트 : " + list);

        System.out.println(map(list, (value) -> value.toUpperCase()));
        System.out.println(map(list, (value) -> "***"+value+"***"));
    }

    public static List<String> map(List<String> list, MyFunction<String> function) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            String s = function.apply(str);
            result.add(s);
        }

        return result;
    }
}
