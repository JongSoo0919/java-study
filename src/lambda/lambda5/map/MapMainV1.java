package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV1 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        // 문자열을 숫자로 변환
        List<Integer> numbers = map(list, str -> Integer.valueOf(str));
        System.out.println(numbers);

        List<Integer> integers = map(list, str -> str.length());
        System.out.println(integers);
    }

    private static List<Integer> map(List<String> list, Function<String, Integer> function) {
        List<Integer> result = new ArrayList<>();
        for (String str : list) {
            Integer x = function.apply(str);
            result.add(x);
        }

        return result;
    }
    private static List<Integer> mapStringToLength(List<String> list) {

        List<Integer> result = new ArrayList<>();
        for (String str : list) {
            result.add(str.length());
        }

        return result;
    }

    private static List<Integer> mapStringToInger(List<String> list) {
        List<Integer> result = new ArrayList<>();
        for (String str : list) {
            Integer integer = Integer.valueOf(str);
            result.add(integer);
        }
        return result;
    }



}
