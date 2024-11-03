package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
//        dogBox.set(cat); // 컴파일 에러
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
//        catBox.set(dog); // 컴파일 에러
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);

        Box<Animal> animalBox = new Box<>();

        animalBox.set(dog); // 자식 타입 모두 가능
        animalBox.get().sound();
        animalBox.set(cat); // 자식 타입 모두 가능
        animalBox.get().sound();

        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
