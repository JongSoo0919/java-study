package poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3 엔진을 킵니다.");
    }
    @Override
    public void offEngine() {
        System.out.println("K3 정지합니다.");
    }
    @Override
    public void processStart() {
        System.out.println("K3 출발합니다.");
    }
}
