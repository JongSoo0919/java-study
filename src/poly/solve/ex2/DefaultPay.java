package poly.solve.ex2;

/**
 * 결제 수단이 없다라는 결제 수단.
 * NullObject Pattern
 */
public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        return false;
    }
}
