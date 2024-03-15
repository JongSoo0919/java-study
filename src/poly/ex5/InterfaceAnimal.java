package poly.ex5;

public interface InterfaceAnimal {
    void sound();
    default void move(){
        System.out.println("동물 이동");
    }
}
