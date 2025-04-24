package lambda.lambda3;

public class GenericMain2 {
    public static void main(String[] args) {
        ObjectFunction upperCase = (s -> ((String) s).toUpperCase());
        System.out.println(upperCase.apply("hello"));

        ObjectFunction square = (s -> ((Integer) s) * ((Integer) s));
        System.out.println(square.apply(3));
    }

    @FunctionalInterface
    interface ObjectFunction{
        Object apply(Object s);
    }
}
