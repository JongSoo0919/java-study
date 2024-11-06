package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objMethod(i);
        Integer o = (Integer) GenericMethod.objMethod(i); // Object 형태 반환이므로 캐스팅 필요

        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer integer = GenericMethod.<Integer>genericMethod(i);
        Integer integer1 = GenericMethod.<Integer>numberMethod(10);
        Double v = GenericMethod.<Double>genericMethod(10.0);

        System.out.println("o = " + o);
        System.out.println("integer = " + integer);
        System.out.println("integer1 = " + integer1);
        System.out.println("v = " + v);

    }
}
