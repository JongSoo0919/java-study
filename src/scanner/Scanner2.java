package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요.");
        int a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력하세요.");
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}
