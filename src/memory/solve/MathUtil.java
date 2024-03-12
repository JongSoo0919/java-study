package memory.solve;

import java.util.Arrays;

public class MathUtil {
    private MathUtil(){
        // instance 생성을 막는 것이 가능.
    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

    public static int max(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static int min(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    public static double avr(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
