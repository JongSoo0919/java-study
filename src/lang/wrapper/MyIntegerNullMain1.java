package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger [] intArr = {new MyInteger(-1), new MyInteger(0), new MyInteger(1)};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // return이 -1이므로, -1을 찾은 것인지 100을 못찾은 것인지 알 수 없음.
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for(MyInteger value : intArr) {
            if (value.getValue() == target) {
                return new MyInteger(value.getValue());
            }
        }
        return null;
    }
}
