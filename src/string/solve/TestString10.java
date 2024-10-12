package string.solve;

public class TestString10 {
    public static void main(String[] args) {
        String fruit = "banana,orange,grape";
        String[] fruits = fruit.split(",");
        for (String f : fruits) {
            System.out.println(f);
        }

        String result = String.join("<", fruits);
        System.out.println(result);
    }
}
