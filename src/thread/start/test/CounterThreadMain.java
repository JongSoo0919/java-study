package thread.start.test;

import util.MyLoggerThread;

import static util.MyLoggerThread.*;

public class CounterThreadMain {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }
}
