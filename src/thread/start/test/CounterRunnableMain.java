package thread.start.test;

public class CounterRunnableMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new CounterRunnable(), "counter");
        thread.start();
    }
}
