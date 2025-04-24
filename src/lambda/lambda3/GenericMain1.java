package lambda.lambda3;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = (s -> s.toUpperCase());
        System.out.println(upperCase.apply("hello"));

        NumberFunction square = s -> s * s;
        System.out.println(square.apply(3));
    }

    interface StringFunction {
        String apply(String s);
    }

    interface NumberFunction {
        Integer apply(Integer s);
    }
}
