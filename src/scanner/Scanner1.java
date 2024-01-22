package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력 하세요. : ");
        String str = sc.nextLine();
        System.out.println(str);

        System.out.print("숫자를 입력 하세요. : ");
        int intValue = sc.nextInt();
        System.out.println(intValue);

        System.out.println("실수를 입력 하세요. : ");
        double doubleValue = sc.nextDouble();
        System.out.println(doubleValue);

    }
}
