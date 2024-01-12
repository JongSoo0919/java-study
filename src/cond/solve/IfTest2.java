package cond.solve;

public class IfTest2 {
    public static void main(String[] args) {
        int distance = 1;

        if (distance <= 1) {
            System.out.println("도보를 이용");
        } else if (distance <= 5) {
            System.out.println("자전거");
        } else if (distance <= 80) {
            System.out.println("자동차");
        } else {
            System.out.println("비행기");
        }
    }
}
