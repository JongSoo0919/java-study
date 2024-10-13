package lang.solve;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // String -> Integer
        Integer x = Integer.valueOf(str);
        System.out.println(x);


        int y = x.intValue();
        System.out.println(y);
    }
}
