package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        // 문제 1. 개 병원에 고양이 전달
//        dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        // 문제 2. 개 타입 반환
        dogHospital.set(dog);
        Dog 멍멍이2 = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("멍멍이2 = " + 멍멍이2);
    }
}
