package string.solve;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "java", "jvm", "spring", "jpa"};
        AtomicInteger sum = new AtomicInteger();
        Arrays.stream(arr)
                .forEach(o -> {
                    System.out.println(o.length());
                    sum.addAndGet(o.length());
                });

        System.out.println(sum.toString());
    }
}
