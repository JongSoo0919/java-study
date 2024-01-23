package method;

public class Method6 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        print(arr);
        change(arr);
        print(arr);
    }

    public static void change(int[] arr) {
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
    }

    public static void print(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
