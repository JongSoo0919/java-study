package methodref.start;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class MethodRefStartV3 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add1 = MethodRefStartV3::add;
        BinaryOperator<Integer> add2 = MethodRefStartV3::add;

        Integer result1 = add1.apply(1, 2);
        System.out.println("result1 = " + result1);

        Integer result2 = add2.apply(1, 2);
        System.out.println("result2 = " + result2);

        UnaryOperator<Integer> unaryOperator = x -> x + 2;
        UnaryOperator<Integer> unaryOperator1 = x -> add(x, 2);
    }

    public static int add(int x, int y) {
        return x + y;
    }
}
