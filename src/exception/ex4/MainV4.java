package exception.ex4;


import exception.ex3.NetworkServiceV3_2;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args)  {
//        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
//        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if("exit".equals(input)) {
                break;
            }
            try{
                networkService.sendMessage(input);
            }catch (Exception e){
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    /**
     * Exception 공통 처리
     * @param e
     */
    private static void exceptionHandler(Exception e) {
        System.out.println("에러 메세지 공통 처리");
        e.printStackTrace(System.out);

        if(e instanceof SendExceptionV4 sendExceptionV4){
            System.out.println("[전송 오류] 전송 데이터: " + sendExceptionV4.getSendData());
        }
    }
}
