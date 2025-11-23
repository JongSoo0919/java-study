package thread.start.control.join;

import static util.MyLoggerThread.log;
import static util.ThreadUtils.sleep;

public class JoinMainV2 {
    public static void main(String[] args) {
        log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);

        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);


        // 정확한 타이밍을 맞추어 기다리기 어려움.
        log("main Thread Sleep()");
        sleep(3000);
        log("main Thread 기상");

        int sumAll = task1.result + task2.result;
        System.out.println(sumAll);
        log("end");
    }

    static class SumTask implements Runnable {
        /*
            int 이므로 초기화 안해도 0
         */
        int startValue;
        int endValue;
        int result = 0;


        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for(int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료 = " + result);
        }
    }
}
