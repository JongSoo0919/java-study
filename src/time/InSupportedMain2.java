package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class InSupportedMain2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("now.isSupported(ChronoField.SECOND_OF_MINUTE) = " + now.isSupported(ChronoField.SECOND_OF_MINUTE));
    }
}
