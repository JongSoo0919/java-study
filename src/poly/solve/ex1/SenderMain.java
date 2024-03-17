package poly.solve.ex1;

/**
 * Sender를 구현하는 클래스를 만들어 반복문을 통해 각각을 출력
 */
public class SenderMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new FacebookSender(), new SMSSender()};

        for (Sender sender : senders) {
            sender.send();
        }
    }
}
