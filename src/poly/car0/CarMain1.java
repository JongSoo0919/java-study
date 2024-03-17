package poly.car0;

/**
 * 다형성이 적용되지 않은 상태,
 * 차가 추가된다면?
 */
public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();

        SonataCar sonataCar = new SonataCar();
        driver.setK3Car(null);
        driver.setSonataCar(sonataCar);
        driver.drive();
    }
}
