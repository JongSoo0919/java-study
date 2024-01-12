package cond.solve;

public class IfTest5 {
    public static void main(String[] args) {
        String grade = "A";

        String answer = switch (grade) {
            case "A" -> "탁월한";
            case "B" -> "잘함";
            case "C" -> "준수";
            case "D" -> "노력";
            default -> "잘못";
        };
        System.out.println(answer);
        
    }
}
