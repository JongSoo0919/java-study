package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자와 두 번째 숫자를 더합니다 (둘 다 0이면 종료)");
            System.out.println("첫 번째 숫자를 입력하세요.");
            int a = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요.");
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            System.out.println("합 : "+a+b);
        }
    }
}
