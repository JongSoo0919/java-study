package lambda.lambda5.map;

import java.util.List;

public class MapMainV5 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");

        // String -> String
        List<String> uppers = GenericMap.map(fruits, str -> str.toUpperCase());
        System.out.println(uppers);

        // String -> Integer
        List<Integer> length = GenericMap.map(fruits, str -> str.length());
        System.out.println(length);

        // Integer -> String
        List<Integer> integers = List.of(1, 2, 3);
        List<String> stars = GenericMap.map(integers, n -> "*".repeat(n));
        System.out.println(stars);
    }
}
