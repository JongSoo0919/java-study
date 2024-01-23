package method;

/**
 * 자바는 항상 값을 복사해서 전달한다.
 */
public class Method5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("change전 a : "+a);
        change(a);
        System.out.println("change method 수행 후 a : " + a);
    }

    public static void change(int a) {
        System.out.println("change method 내에 전달된 a : "+a);
        a *= 2;
        System.out.println("change method 내에 전달된 a * 2 : "+a);
    }
}
