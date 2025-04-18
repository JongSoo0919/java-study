package lambda.lambda1;

public class SamMain {
    public static void main(String[] args) {
        SamInterface samInterface = () -> {
            System.out.println("가능");
        };

//        NotSamInterface notSamInterface = () -> {
//            System.out.println("불가능");
//        };
    }
}
