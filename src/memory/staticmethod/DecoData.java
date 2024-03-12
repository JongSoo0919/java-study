package memory.staticmethod;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; // 정적 변수 접근 : 접근 가능.
        staticValue(); // 정적 메서드 : 접근 가능.

//        instanceValue++; //인스턴스 변수 접근, 컴파일 에러
//        instanceMethod(); //인스턴스 메서드 접근, 컴파일 에러
    }

    public void instanceCall() {
        instanceValue++; // 본인의 인스턴스 밸류에 접근 : 접근 가능.
        instanceMethod(); // 본인의 인스턴스 메서드에 접근 : 접근 가능.

        staticValue++; // 정적 변수는 이미 JVM이 로딩될 떄 메서드 영역의 static 영역에 올라가있으므로, 접근 가능.
        staticValue(); // 정적 메서드 또한 JVM이 로딩될 때 메서드 영역의 static 영역에 올라가있으므로, 접근 가능.
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }
    private static void staticValue() {
        System.out.println("staticValue = " + staticValue);
    }
}
