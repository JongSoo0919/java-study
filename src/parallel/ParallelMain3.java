package parallel;

import util.MyLogger;

import java.util.concurrent.*;

import static util.MyLogger.log;

public class ParallelMain3 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // 쓰레드 풀 준비
        ExecutorService es = Executors.newFixedThreadPool(2);

        long startTime = System.currentTimeMillis();

        // 1. Fork - 작업을 분할.
        SumTask task1 = new SumTask(1, 4);
        SumTask task2 = new SumTask(5, 8);
        SumTask task3 = new SumTask(7, 10);
        SumTask task4 = new SumTask(9, 12);

        // 2. 분할 작업 처리
        Future<Integer> future1 = es.submit(task1);
        Future<Integer> future2 = es.submit(task2);
        Future<Integer> future3 = es.submit(task3);
        Future<Integer> future4 = es.submit(task4);

        // 3. join - 처리한 결과를 합침
        Integer result1 = future1.get();
        Integer result2 = future2.get();
        Integer result3 = future3.get();
        Integer result4 = future4.get();
        MyLogger.log("main 스레드 대기 완료");

        int sum = result1 + result2;


        long endTime = System.currentTimeMillis();
        log("time: " + (endTime - startTime) + "ms, sum: " + sum);

        es.shutdown();
    }
    static class SumTask implements Callable<Integer> {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public Integer call() throws Exception {
            MyLogger.log("작업 시작");
            int sum = 0;
            for (int i = startValue; i <= endValue; i++) {
                int calculated = HeavyJob.heavyTask(i);
                sum += calculated;
            }
            result = sum;
            MyLogger.log("작업 완료 result = " + result);
            return sum;
        }
    }
}

