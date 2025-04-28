package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1_Number {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(direct(list));

        List<Integer> filter = filter(list, x -> x % 2 == 0);
        System.out.println(filter);

        List<Integer> map = map(filter, x -> x * 2);
        System.out.println(map);

        System.out.println(lambda(list));

        List<String> strings = List.of("AA","BB","CC","ddd","eee","fff");
        List<String> stringsFilter = filter(strings, str -> str.length() > 2);
        List<String> stringsMap = map(stringsFilter, str -> str.toUpperCase());
        System.out.println(stringsMap);

    }

    public static List<Integer> direct(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer x : list) {
            if (x % 2 == 0) {
                result.add(x * 2);
            }
        }
        return result;
    }

    public static List<Integer> lambda(List<Integer> list) {
        List<Integer> even = even(list, x -> x % 2 == 0);
        List<Integer> multi = multi(even, x -> x * 2);
        return multi;
    }

    public static List<Integer> even(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for(Integer x : list) {
            if (predicate.test(x)) {
                result.add(x);

            }
        }
        return result;
    }

    public static List<Integer> multi(List<Integer> list, Function<Integer, Integer> function) {
        List<Integer> result = new ArrayList<>();
        for (Integer x : list) {
            result.add(function.apply(x));
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T x : list) {
            if(predicate.test(x)) result.add(x);
        }
        return result;
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T x : list) {
            result.add(function.apply(x));
        }
        return result;
    }
}
