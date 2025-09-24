package thread.start.test;

import util.MyLoggerThread;

import static util.MyLoggerThread.*;

public class CounterThread extends Thread {
    int count = 1;
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            log("value: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
