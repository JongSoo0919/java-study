package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        while(true){
            System.out.println("0을 입력하기 전까지 모든 숫자를 더하는 프로그램");
            int a = sc.nextInt();
            sum += a;
            if(a == 0){
                System.out.println(sum);
                break;
            }
        }
    }
}
