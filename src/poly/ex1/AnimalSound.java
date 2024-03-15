package poly.ex1;

/**
 * 중복을 제거하고 코드를 간단화 시킬 수 없을까 ?
 * 지금은 동물이 추가 될 때 마다 해야하는 상태.
 * 타입이 다르므로 함수로 중복을 제거하는 것 또한 불가능
 */
public class AnimalSound {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();


        System.out.println("동물 소리 테스트 시작");
        dog.sound();
        System.out.println("동물 소리 테스트 끝");

        System.out.println("동물 소리 테스트 시작");
        cat.sound();
        System.out.println("동물 소리 테스트 끝");

        System.out.println("동물 소리 테스트 시작");
        cow.sound();
        System.out.println("동물 소리 테스트 끝");
    }
}
