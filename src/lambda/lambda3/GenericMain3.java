
package lambda.lambda3;

public class GenericMain3 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = str -> str.toUpperCase();
        GenericFunction<Integer, Integer> square = n -> n * n;

        System.out.println(upperCase.apply("Hello"));
        System.out.println(square.apply(3));


        GenericFunction<Integer, Boolean> isEven = n -> n % 2 == 0;
        GenericFunction<Integer, String> str = n -> "str " + n;

        System.out.println(isEven.apply(5));
        System.out.println(str.apply(151515));

    }

    @FunctionalInterface
    interface GenericFunction <T, R>{
        R apply(T s);
    }
}
