package thread.volatile1;

import static util.MyLoggerThread.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");

        t.start();

        sleep(300);

        task.flag = false;
        log("flag = " + task.flag + " count = " + task.count);
    }
    static class MyTask implements Runnable {
//        boolean flag = true;
//        long count;

        volatile boolean flag = true;
        volatile long count;

        @Override
        public void run() {
            while(flag) {
                count++;

                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + " count = " + count);
                }
            }
            log("flag = " + flag + " count = " + count + "종료 !!!!");
        }
    }
}
