package lambda.lambda1;

import lambda.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("Hello lambda");
            }
        };
        procedure.run();

        // 단일 표현식은 중괄호 생략 가능
        Procedure procedure1 = () -> System.out.println("Hello Lambda");
        procedure1.run();


    }
}
