package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate start = LocalDate.of(year, month, 1);
        LocalDate end = LocalDate.of(year, month, 1).with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("start = " + start.getDayOfWeek());
        System.out.println("end = " + end.getDayOfWeek());

    }
}
