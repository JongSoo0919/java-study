package stream.collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collectors4MinMax {
    public static void main(String[] args) {
        // 다운스트림 컬렉터에서 유용하게 사용 가능.
        Integer max1 = Stream.of(1, 2, 3)
                .collect(Collectors.maxBy((o1, o2) -> o2 - o1))
                .get();
        System.out.println(max1);

        Integer max2 = Stream.of(4, 5, 6)
                .max((o1, o2) -> o1 - o2)
                .get();
        System.out.println(max2);

        Integer max3 = Stream.of(1, 2, 3)
                .max(Integer::compare)
                .get();
        System.out.println(max3);

        //기본형 특화 스트림
        int max4 = IntStream.rangeClosed(1, 6)
                .max()
                .getAsInt();
        System.out.println(max4);
    }
}
