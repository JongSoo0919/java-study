package cond.solve;

public class IfTest1 {
    public static void main(String[] args) {
        int score = 85;

        String grade = switch (score) {
            case 90 -> "A";
            case 80 -> "B";
            case 70 -> "C";
            case 60 -> "D";
            default -> "F";
        };

        System.out.println(grade);
    }
}
