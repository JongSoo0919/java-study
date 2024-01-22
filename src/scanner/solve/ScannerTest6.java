package scanner.solve;

import java.util.Scanner;

public class ScannerTest6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCoast = 0;
        while(true){
            System.out.println("1. 상품 입력 , 2 : 결제 , 3 : 프로그램 종료");
            int order = sc.nextInt();

            if (order == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (order == 1) {
                System.out.print("책 이름을 입력하세요 : ");
                String bookName = sc.nextLine();
                System.out.print("상품의 가격을 입력하세요 : ");
                int price = sc.nextInt();
                System.out.print("구매 수량을 입력하세요 : ");
                int quantity = sc.nextInt();

                totalCoast += price * quantity;

                System.out.println("구입하려는 상품 : "+bookName);
                continue;
            }

            if (order == 2) {
                System.out.println("결제를 진행합니다. 가격 : " + totalCoast);
                totalCoast = 0;
            }
        }
    }
}
