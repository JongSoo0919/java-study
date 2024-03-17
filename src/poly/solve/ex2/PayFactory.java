package poly.solve.ex2;

public abstract class PayFactory {
    public static Pay getPay(String option) {
        if ("kakao".equals(option)) {
            return new KakaoPay();
        }

        if ("naver".equals(option)) {
            return new NaverPay();
        }

        if ("new".equals(option)) {
            return new NewPay();
        }

        return new DefaultPay();
    }
}
