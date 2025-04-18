package lambda.ex1;

import java.util.Arrays;

public class M3Before {
    static interface Run {
        void run();
    }

    public static void main(String[] args) {
        Run run1 = new Run() {
            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += i;
                }

                System.out.println("[1부터 100까지의 합] 결과: " + sum);
            }
        };

        Run run2 = new Run() {
            @Override
            public void run() {
                int[] arr = {4, 3, 2, 1};
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        };

        run(run1);
        System.out.println();
        run(run2);

    }

    public static void run(Run run) {
        long start = System.currentTimeMillis();
        run.run();
        long end = System.currentTimeMillis();
        System.out.println("실행 시간: " + (end-start) +"ns");
    }
}
