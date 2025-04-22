package lambda.ex4;

import lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (int val : list) {
            if (predicate.test(val)) {
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
        System.out.println("원본 리스트 : " + numbers);

        System.out.println(filter(numbers, (value -> value < 0)));
        System.out.println(filter(numbers, (value -> value % 2 == 0)));
    }
}
