package method;

/**
 * 메서드도 형 변환이 적용
 */
public class MethodCasting1 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
//        printNumber(doubleValue); 형 변환 에러
        printNumber((int) doubleValue); // 큰(double) -> 작은(int)로 가므로 값 손실이 있을 수 있음.

        int intValue = 100;
        printNumber2(intValue); // 작은(int) -> 큰(double) 로 가므로 자동 형 변환이 발생 (double)intValue; 인셈
    }
    public static void printNumber(int a) {
        System.out.println(a);
    }

    public static void printNumber2(double a) {
        System.out.println(a);
    }
}
