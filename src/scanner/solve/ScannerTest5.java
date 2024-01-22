package scanner.solve;

import java.util.Scanner;

public class ScannerTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i = b; i < a; i++){
            System.out.println(i);
        }
    }
}
