package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("문자열을 입력 하세요. (exit : 종료)");
            String str = sc.nextLine();
            if ("exit".equals(str)) {
                break;
            }

            System.out.println(str);
        }
    }
}
