package nested.solve;

public class AnonymousMain {
    public static void main(String[] args) {
        AnonymousInterface anonymous = new AnonymousInterface() {
            @Override
            public void hello() {
                System.out.println("Hello");
            }
        };

        anonymous.hello();
    }
}
