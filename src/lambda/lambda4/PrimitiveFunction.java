package lambda.lambda4;

import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {
    public static void main(String[] args) {
        // 기본형 매개변수, IntFunction, LongFunction, DoubleFuntion
        IntFunction<String> function = x -> "숫자 + " + x;
        System.out.println(function.apply(10));

        // 기본형 반환, ToIntFunction
        ToIntFunction<String> function1 = x -> x.length();
        System.out.println(function1.applyAsInt("HELOLOLOLOL"));

        // 기본형 매개변수, 기본형 반환
        IntToLongFunction intToLongFunction = x -> x * 100L;
        System.out.println(intToLongFunction.applyAsLong(50));

        // IntUnaryOperator : int -> int
        IntUnaryOperator intUnaryOperator = x -> x * 2;
        System.out.println(intUnaryOperator.applyAsInt(10));

        // 기타, IntConsumer, IntSupplier, IntPredicate
    }
}
