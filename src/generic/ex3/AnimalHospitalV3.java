package generic.ex3;


import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름 : " + animal.getName()); // 컴파일 오류
        System.out.println("동물 크기 : " + animal.getSize()); // 컴파일 오류
        animal.sound(); // 컴파일 오류
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target; // 컴파일 오류
    }
}
