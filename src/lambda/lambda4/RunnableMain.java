package lambda.lambda4;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Runnable");
            }
        };

        runnable.run();
        Runnable runnable1 = () -> System.out.println("Hello Runnable1");
        runnable1.run();

    }
}
