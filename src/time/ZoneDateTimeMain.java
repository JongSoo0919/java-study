package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 30, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTime = " + zonedDateTime);

        ZonedDateTime utc = zonedDateTime.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc = " + utc);


    }
}
