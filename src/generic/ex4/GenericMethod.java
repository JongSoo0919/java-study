package generic.ex4;

public class GenericMethod {
    public static Object objMethod(Object obj){
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj){ // <T>를 통해 제네릭 메서드임을 표기 Scope는 메서드 내부 지역변수
        System.out.println("Object print : " + obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T t){ // 타입 매개변수 제한 가능
        System.out.println("bound print" + t);
        return t;
    }

}
