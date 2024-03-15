package poly.ex2;

/**
 * Animal을 상속 받아 같은 부모를 가진 자식클래스로 묶어 함수화
 */
public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        Animal[] animals = new Animal[]{dog, cat, caw};
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
