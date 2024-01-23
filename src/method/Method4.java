package method;

/***
 * 반환 타입이 있는 메서드는 값을 반드시 반환해야함.
 */
public class Method4 {
    public static void main(String[] args) {
        System.out.println(isOdd(3));
    }

    // else상황에서 return이 없기에 오류
//    public static boolean isOdd(int i) {
//        if(i % 2 == 0) return true;
//    }

    public static boolean isOdd(int i) {
        return i % 2 == 0;
    }
}
