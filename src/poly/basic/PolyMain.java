package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수타입으로 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
//        poly.childMethod(); // 부모 타입의 변수이므로 자식 타입의 메서드를 사용할 수 없음.

    }
}
