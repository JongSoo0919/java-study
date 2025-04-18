package lambda.lambda2;

import lambda.MyFunction;

// 2. 람다를 메서드(함수)에 전달하기
public class LambdaPassMain2 {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a + b;
        MyFunction sub = (a, b) -> a - b;

        System.out.println("변수를 통해 전달");
        calc(add);
        calc(sub);

        calc((a, b) -> a + b);
        calc((a, b) -> a - b);
    }

    public static void calc(MyFunction myFunction) {
        int a = 1;
        int b = 2;

        System.out.println("계산 시작");
        int result = myFunction.apply(a, b);
        System.out.println("계산 결과" + result);
    }
}
