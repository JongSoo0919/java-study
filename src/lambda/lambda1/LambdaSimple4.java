package lambda.lambda1;

import java.util.function.DoubleUnaryOperator;

public class LambdaSimple4 {
    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2;
        MyCall call2 = (value) -> value * 2;
        MyCall call3 = value -> value * 2; // 매개변수 1개만 있을 때 .
    }
    interface MyCall {
        int call(int value);
    }
}
