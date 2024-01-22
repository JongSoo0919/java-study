package scanner.solve;

import java.util.Scanner;

public class ScannerTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요");
        String foodName = sc.nextLine();

        System.out.println("가격을 입력해주세요");
        int price = sc.nextInt();

        System.out.println("수량을 입력해주세요.");
        int count = sc.nextInt();

        System.out.println(foodName + " : " +price * count);
    }
}


