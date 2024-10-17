package time.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0, 0), ZoneId.of("Asia/Seoul"));
        ZonedDateTime zonedDateTime2 = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));

        System.out.println("zonedDateTime = " + zonedDateTime);
        System.out.println("zonedDateTime2 = " + zonedDateTime2);
    }
}
