package poly.car0;

public class Driver {
    private K3Car k3Car;
    private SonataCar sonataCar;

    public void setSonataCar(SonataCar sonataCar) {
        this.sonataCar = sonataCar;
    }

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다");
        if(k3Car != null) {
            k3Car.startEngine();
            k3Car.processStart();
            k3Car.offEngine();
        } else if (sonataCar != null) {
            sonataCar.startEngine();
            sonataCar.processStart();
            sonataCar.offEngine();
        }
    }

}
