package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(1996, 9, 19);
        System.out.println("nowDate = " + nowDate);
        System.out.println("ofDate = " + ofDate);

        //계산(불변)
        ofDate = ofDate.plusDays(10);
        System.out.println("ofDate = " + ofDate);
    }
}
