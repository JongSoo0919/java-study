package string.solve;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0, 5);
        String exName = str.substring(5, str.length());

        System.out.println(filename);
        System.out.println(exName);
    }
}
