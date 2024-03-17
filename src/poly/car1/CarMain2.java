package poly.car1;


/**
 * 다형성을 적용한 예
 * K3, Sonata 둘 모두 Car라는 인터페이스를 구현하고 있으므로,
 * Driver는 Car를 구현하는 어떤 실체 클래스가 들어오더라도 변경없이 기능이 작동.
 * 인터페이스는 앞으로 자동차가 늘어날 때 변경없이 구현체를 늘려나갈 수 있음.
 * 또한, 클라이언트(Driver)또한 변경 없이 기능이 작동
 */
public class CarMain2 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택 K3
        driver.setCar(new K3Car());
        driver.drive();

        //차량 변경 K3 -> Sonata
        driver.setCar(new SonataCar());
        driver.drive();
    }
}
