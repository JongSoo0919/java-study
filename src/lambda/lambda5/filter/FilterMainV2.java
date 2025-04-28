package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filter = filter(numbers, (x) -> x % 2 == 0);
        List<Integer> filter2 = filter(numbers, (x) -> x % 2 == 1);

        System.out.println(filter);
        System.out.println(filter2);

    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer x : numbers) {
            if (predicate.test(x)) {
                result.add(x);
            }
        }
        return result;
    }
}
