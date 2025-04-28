package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filter = IntegerFilter.filter(numbers, (x) -> x % 2 == 0);
        List<Integer> filter2 = IntegerFilter.filter(numbers, (x) -> x % 2 == 1);

        System.out.println(filter);
        System.out.println(filter2);

    }

}
