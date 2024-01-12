package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        b = ++a; // 증가한 후 대입
        System.out.println(a + " : " + b);

        int c = 1;
        int d = 0;

        d = c++;
        System.out.println(c + " : " + d);

    }
}
