package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();

        // 문제 1. 개 병원에 고양이 전달
//        dogHospital.setAnimal(cat); // 다른 타입 입력으로 인해 컴파일 오류 발생

        // 문제 2. 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog 멍멍이2 = dogHospital.bigger(new Dog("멍멍이2", 200)); // 제네릭을 통해 Dog타입으로 반환하므로 다운 캐스팅이 필요하지 않음.
        System.out.println("멍멍이2 = " + 멍멍이2);
    }
}
