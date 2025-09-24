package thread.start.test;

import util.MyLoggerThread;

import static util.MyLoggerThread.*;

public class StartTest4Main  {
    public static void main(String[] args) {
//        Runnable runnable1 = () -> {
//            while(true) {
//                log("A");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Runnable runnable2 = () -> {
//            while(true) {
//                log("B");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Thread thread1 = new Thread(runnable1, "Thread-A");
//        Thread thread2 = new Thread(runnable2, "Thread-B");
//
//        thread1.start();
//        thread2.start();
        Thread thread1 = new Thread(new PrintWork("A", 1000), "Thread-A");
        Thread thread2 = new Thread(new PrintWork("B", 500), "Thread-B");

        thread1.start();
        thread2.start();
    }

    static class PrintWork implements Runnable {
        private String content;
        private int sleep;

        public PrintWork(String content, int sleep) {
            this.content = content;
            this.sleep = sleep;
        }

        @Override
        public void run() {
            while(true) {
                log(content);
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}