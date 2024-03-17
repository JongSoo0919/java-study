package poly.car1;

public class SonataCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("Sonata 엔진을 킵니다.");
    }
    @Override
    public void offEngine() {
        System.out.println("Sonata 정지합니다.");
    }
    @Override
    public void processStart() {
        System.out.println("Sonata 출발합니다.");
    }
}
