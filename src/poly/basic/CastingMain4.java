package poly.basic;

//다운 캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent;
        child.childMethod(); // 문제 없음.

        Parent parent1 = new Parent();
        Child child1 = (Child) parent1;
        child1.childMethod();
    }
}
