package string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        str = str.concat("java");
        System.out.println("str = " + str);

        Object obj = new Object();
        System.out.println(String.valueOf(obj));

        char[] arr = "Hello".toCharArray();
        arr[0] = 'j';
        System.out.println(arr);
    }
}
