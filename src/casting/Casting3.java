package casting;

public class Casting3 {
    public static void main(String[] args) {
        int intValue = 2147483647;
        double doubleValue = 2147483648L;

        int i = (int) doubleValue;
        System.out.println("i = " + i);
    }
}
