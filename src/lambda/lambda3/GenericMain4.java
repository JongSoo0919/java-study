
package lambda.lambda3;

public class GenericMain4 {
    public static void main(String[] args) {

    }

    @FunctionalInterface
    interface GenericFunction <T, R>{
        R apply(T s);
    }
}
