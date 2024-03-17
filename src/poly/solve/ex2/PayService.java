package poly.solve.ex2;

public class PayService {
    private Pay pay;

    public void setPay(Pay pay) {
        this.pay = pay;
    }

    public void processPay(String option, int amount) {
        setPay(PayFactory.getPay(option));
        boolean result = pay.pay(amount);
        if (result) {
            System.out.println("결제 성공");
        } else {
            System.out.println("결제 실패");
        }
    }

}
