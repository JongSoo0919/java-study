package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("a가 더 큼");
        } else if (a < b) {
            System.out.println("b가 더 큼");
        } else {
            System.out.println("같음");
        }
    }
}
