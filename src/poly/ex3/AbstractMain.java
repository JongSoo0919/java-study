package poly.ex3;


public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스는 직접 인스턴스 생성이 불가능
//        AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        dog.move();
        cat.move();
        caw.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
