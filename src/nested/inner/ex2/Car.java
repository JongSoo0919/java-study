package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
    }

    public void start() {
        engine.start();
        System.out.println("자동차 start");
    }

    // Car에서만 사용하므로 private으로 선언하여, 타 클래스에서 접근을 막을 수 있음.
    private class Engine {
        //Car에 대한 정보를 몰라도 내부클래스기에 접근이 가능

        public void start() {
            System.out.println("충전 레벨 확인 : " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");

        }
    }

}
