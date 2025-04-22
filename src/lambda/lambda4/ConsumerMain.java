package lambda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        // 익명 클래스
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + " 로그를 찍었다.");
            }
        };
        consumer1.accept("log");

        Consumer<String> consumer2 = s -> System.out.println(s + "로그를 찍었다.");
        consumer2.accept("log log");
    }
}
