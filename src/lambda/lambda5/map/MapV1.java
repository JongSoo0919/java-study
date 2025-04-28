package lambda.lambda5.map;

import java.util.List;
import java.util.function.Function;

public class MapV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");
        List<Integer> numbers = GenericMap.map(list, str -> Integer.parseInt(str));
        List<String> strings = GenericMap.map(list, str -> "***" + str + "***");
        List<Integer> length = GenericMap.map(list, str -> str.length());
        List<Character> first = GenericMap.map(list, str -> str.charAt(0));

        System.out.println(numbers);
        System.out.println(strings);
        System.out.println(length);
        System.out.println(first);
    }
}
