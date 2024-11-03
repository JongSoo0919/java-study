package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); // 생성 시점에 T의 타입을 결정.
        integerBox.set(10);
//        integerBox.set("100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 반환(캐스팅 필요 X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.set("Hello");
//        stringBox.set(100); // String 타입만 허용, 컴파일 오류
        String string = stringBox.get(); // String 타입 반환(캐스팅 필요 X)
        System.out.println("string = " + string);

        //원하는 모든 타입 사용 가능
        GenericBox<Double> doubleGenericBox = new GenericBox<>();
        doubleGenericBox.set(3.14);
        Double doubleDouble = doubleGenericBox.get();
        System.out.println("doubleDouble = " + doubleDouble);

    }
}
