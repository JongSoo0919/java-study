package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis()); // seed가 같으면 Random의 결과가 같음.

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); // 0 ~ 9
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("randomRange2 = " + randomRange2);
    }
}