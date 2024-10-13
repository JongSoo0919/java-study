package lang.solve;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer x = Integer.valueOf(str);
        System.out.println(x);


        int y = x;
        System.out.println(y);

        Integer integer = x;
        System.out.println(integer);

    }
}
