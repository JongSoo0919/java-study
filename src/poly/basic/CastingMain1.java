package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
//        poly.childMethod(); //자식의 기능 사용 불가능

//        Child child = poly; // 부모는 자식을 담을 수 있으나, 자식은 부모를 담을 수 없음.
//        child.childMethod();

        Child child = (Child) poly;
        child.childMethod();

        ((Child) poly).childMethod();
    }
}
