package scanner.solve;

import java.util.Scanner;

public class ScannerTest4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 단을 출력하시겠습니까");
        int input = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(input + " * " + i + " = "+input*i);
        }
    }
}
