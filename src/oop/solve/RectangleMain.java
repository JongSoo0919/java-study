package oop.solve;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);
        System.out.println("넓이 : " + rectangle.calculateArea());
        System.out.println("둘레 : " + rectangle.calculatePerimeter());
        System.out.println("정사각형 여부 : " + rectangle.isSquare());
    }
}
