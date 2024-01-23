package method;

public class Method2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(add(a, b));

        int x = 10;
        int y = 20;
        System.out.println(add(x, y));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
