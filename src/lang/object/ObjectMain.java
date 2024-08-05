package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString 메서드는 Object의 메서드
        System.out.println(child.toString());

    }
}
