package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅 : Date to String
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        String formattedDate = date.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
        System.out.println("formattedDate = " + formattedDate);
        
        // 파싱 : String to Date
        String input = "2030년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
        System.out.println("parsedDate = " + parsedDate);
    }
}
