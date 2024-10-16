package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(16, 10, 10);
        System.out.println("nowTime = " + nowTime);
        System.out.println("localTime = " + localTime);

        localTime = localTime.plusHours(2);
        System.out.println("localTime = " + localTime);
    }
}
