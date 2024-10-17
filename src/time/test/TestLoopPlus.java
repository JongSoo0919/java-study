package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 01, 01);
        System.out.println("date = " + date);
        for (int i = 0; i < 4; i++) {
            date = date.plus(14, ChronoUnit.DAYS);
            System.out.println("date = " + date);
        }
    }
}
