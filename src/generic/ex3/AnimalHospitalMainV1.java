package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.setAnimal(dog);
        dogHospital.checkUp();

        // 고양이 병원
        catHospital.setAnimal(cat);
        catHospital.checkUp();

        // 문제 1. 개 병원에 고양이 전달
        dogHospital.setAnimal(cat); // 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음. 개 병원에는 개만 들어가야 하나 Animal을 상속받은 Cat도 들어갈 수 있음.

        // 문제 2. 개 타입 반환
        dogHospital.setAnimal(dog);
//        Dog 멍멍이2 = dogHospital.bigger(new Dog("멍멍이2", 200)); // 컴파일 오류 : Dog타입을 반환하는게 아닌 Animal로 반환됨. 다운 캐스팅이 필수가 됨. 다운캐스팅으로 인해 발생하는 문제는 개발자가 책임져야함.
//        System.out.println("멍멍이2 = " + 멍멍이2);
    }
}
