package poly.ex6;


public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
//        flyAnimal(dog); // 불가능
        soundAnimal(bird);
        flyAnimal(bird);
        soundAnimal(chicken);
        flyAnimal(chicken);

    }


    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("날아라 fly");
    }
}
