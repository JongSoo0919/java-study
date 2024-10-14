package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Http Code : ");
        int httpCodeInput = sc.nextInt();

        HttpStatus status = HttpStatus.findByCode(httpCodeInput);
        System.out.println(status.getCode() + " " + status.getMessage());
        System.out.println("is Success : " + status.isSuccess());
    }
}
