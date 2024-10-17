package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        System.out.println("startDate = " + startDate);
        System.out.println("endDate = " + endDate);
        Period period = Period.between(startDate, endDate);
        System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());
        System.out.println("ChronoUnit.DAYS.between(startDate,endDate) = " + ChronoUnit.DAYS.between(startDate, endDate));
    }
}
