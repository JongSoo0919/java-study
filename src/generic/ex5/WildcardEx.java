package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {

    //제네릭 메서드 타입 추론에 의해 T는 Dog가 됨, 물론 Animal.getName을 사용할 순 없음 컴파일 단계에서는 어떤 값이 들어올 지 모르니까.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    // 제네릭 메서드가 아닌 일반적인 메서드
    // Box<Dog> dogBox를 전달. 와일드카드 ? 는 모든 타입을 받을 수 있음.
    static void printWildcardV1(Box<?> box) {
        System.out.println(" ? = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturn(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
}
