package enumeration.test;

import java.util.Arrays;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();
        Arrays.stream(authGrades)
                .forEach(o -> System.out.println(o.toString()));
    }

}
