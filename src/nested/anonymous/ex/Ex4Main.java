package nested.anonymous.ex;

import java.util.Random;

public class Ex4Main {

    public static void hello(Runner runner) {
        System.out.println("프로그램 시작");
        runner.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(new Runner() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        hello(new Runner() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
