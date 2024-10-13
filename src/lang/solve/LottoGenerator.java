package lang.solve;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;

            if (!isUnique(number)) {
                continue;
            }

            // 중복되지 않은 경우에만 배열 추가
            lottoNumbers[count] = number;
            count++;
        }

        return lottoNumbers;
    }

    //이미 생성된 번호와 중복되는가 ?
    public boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if(lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}
