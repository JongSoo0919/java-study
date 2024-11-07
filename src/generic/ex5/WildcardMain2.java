package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
//        writeBox(dogBox); // Animal 타입보다 하위(자식)이므로 컴파일 에러
//        writeBox(catBox); // Animal 타입보다 하위(자식)이므로 컴파일 에러
    }

    static void writeBox(Box<? super Animal> box) {
        System.out.println(box.toString());
        System.out.println(box.get());
    }

}
