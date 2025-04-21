package lambda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    public static List<Integer> filter(List<Integer> list, MyPredicate predicate) {
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
        filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        });

        filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        });

        MyPredicate myPredicate1 = new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        };

        MyPredicate myPredicate2 = new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        };

        System.out.println("음수만: " + filter(numbers, myPredicate1));
        System.out.println("짝수만: " + filter(numbers, myPredicate2));

        System.out.println("음수만 : " + filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value < 0;
            }
        }));

        System.out.println("짝수만 : " + filter(numbers, new MyPredicate() {
            @Override
            public boolean test(int value) {
                return value % 2 == 0;
            }
        }));

        System.out.println(filter(numbers, (value -> value < 0)));
        System.out.println(filter(numbers, (value -> value % 2 == 0)));
    }
}
