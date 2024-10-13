package lang.solve;

import java.util.*;

public class LottoGernerateMain {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] lottoNumbers = lottoGenerator.generate();

        Arrays.sort(lottoNumbers);
        Arrays.stream(lottoNumbers).forEach(System.out::println);

    }
}
