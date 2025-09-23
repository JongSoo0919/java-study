package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main Thread() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+": start() 호출 전");
        helloThread.run(); // 절대 아님.
        System.out.println(Thread.currentThread().getName()+": start() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main Thread() end");
    }
}
