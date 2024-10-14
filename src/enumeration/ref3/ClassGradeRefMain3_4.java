package enumeration.ref3;


import java.util.Arrays;

public class ClassGradeRefMain3_4 {
    public static void main(String[] args) {
        int price = 10000;

        Grade[] values = Grade.values();
        Arrays.stream(values)
                .forEach(o -> printDiscount(o, price));
    }
    public static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 " + grade.discount(price));
    }
}
