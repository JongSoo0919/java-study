package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.of(2024, 1, 10), LocalTime.of(15, 10, 25));
        System.out.println("localDateTime = " + localDateTime);

        //날짜와 시간 분리
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime1 = localDateTime.plusWeeks(144);
        System.out.println("localDateTime1 = " + localDateTime1);
    }
}
