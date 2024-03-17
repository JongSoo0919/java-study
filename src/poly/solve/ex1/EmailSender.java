package poly.solve.ex1;

public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("이메일 센더");
    }
}
