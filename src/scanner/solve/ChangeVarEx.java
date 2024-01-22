package scanner.solve;

import java.util.Scanner;

public class ChangeVarEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("원래 숫자 : " + a + " : " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("바뀐 숫자 : " + a + " : " + b);
    }
}
