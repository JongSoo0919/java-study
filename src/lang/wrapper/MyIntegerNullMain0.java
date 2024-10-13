package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100)); // return이 -1이므로, -1을 찾은 것인지 100을 못찾은 것인지 알 수 없음.
    }

    private static int findValue(int[] intArr, int target) {
        for(int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
