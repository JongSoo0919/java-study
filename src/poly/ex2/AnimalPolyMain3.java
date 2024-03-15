package poly.ex2;

/**
 * Animal을 상속 받아 같은 부모를 가진 자식클래스로 묶어 함수화
 */
public class AnimalPolyMain3 {
    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Dog(), new Cat(), new Caw()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
