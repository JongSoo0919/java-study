package memory.solve;

public class Car {
    private String name;
    private static int totalCars;

    public Car(String name) {
        System.out.println("차랑 구입, 이름 : " + name);
        this.name = name;
        totalCars++;
    }

    public static int getTotalCars(){
        return totalCars;
    }
}
