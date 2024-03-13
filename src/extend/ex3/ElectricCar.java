package extend.ex3;

public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println("전기차를 움직인다.");
    }
    public void charge(){
        System.out.println("전기차를 충전합니다.");
    }
}
