package poly.solve.ex2;

/**
 * 기존 코드를 OCP를 지켜 만들 수 있도록 리팩토링
 * PayService(Client)는 추가적인 결제 수단이 생기더라도 변경이 없음. (Closed)
 * Pay(Interface)를 구현하는 새로운 결제 수단이 생기면 단순히 Pay를 구현하는 객체를 하나 더 붙이면 됨.(Open)
 */
public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 500;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 1500;
        payService.processPay(payOption2, amount2);

        //new 결제
        String payOption4 = "new";
        int amount4 = 1500;
        payService.processPay(payOption4, amount4);

        //없음.
        String payOption3 = "not exist";
        int amount3 = 2500;
        payService.processPay(payOption3, amount3);
    }
}
