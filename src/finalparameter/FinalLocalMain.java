package finalparameter;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;

//        data1 = 20; // compile error
        final int data2 = 20;
    }
    public static void method(final int parameter) {
//        parameter = 30; // compile error
    }
}
