package memory.solve;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("GV70");
        Car car3 = new Car("GV80");

        System.out.println(Car.getTotalCars());
    }
}
