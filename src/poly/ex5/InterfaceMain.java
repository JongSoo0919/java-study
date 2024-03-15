package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스는 인스턴스 생성 불가
//        InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Cat cat = new Cat();
        Caw caw = new Caw();
        Dog dog = new Dog();

        cat.move();
        cat.sound();

        caw.move();
        caw.sound();

        dog.move();
        dog.sound();

    }
}
