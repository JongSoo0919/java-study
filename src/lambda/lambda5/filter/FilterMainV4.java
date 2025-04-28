package lambda.lambda5.filter;

import java.util.List;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> genericNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filter = IntegerFilter.filter(genericNumbers, (x) -> x % 2 == 0);
        List<Integer> filter2 = IntegerFilter.filter(genericNumbers, (x) -> x % 2 == 1);

        System.out.println(filter);
        System.out.println(filter2);

        // 문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        List<String> stringResult = GenericFilter.filter(strings, string -> string.length() >= 2);
        System.out.println(stringResult);

    }

}
