package cond.solve;

public class IfTest3 {
    public static void main(String[] args) {
        int dollar = 10;
        if (dollar < 0) {
            System.out.println("잘못된 금액");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println(dollar * 1300);
        }
    }
}
