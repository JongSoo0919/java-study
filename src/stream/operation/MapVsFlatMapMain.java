package stream.operation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> outerList = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );
        System.out.println(outerList);

        // 일반적인 평탄화
        List<Integer> forResult = new ArrayList<>();
        for (List<Integer> list : outerList) {
            for (int x : list) {
                forResult.add(x);
            }
        }
        System.out.println(forResult);

        // map으로 가능?
        List<List<Integer>> list1 = outerList.stream()
                .map(list -> list.stream()
                        .map(i -> i * 2)
                        .toList())
                .toList();
        System.out.println(list1);

        // flatMap
        List<Integer> list2 = outerList.stream()
                .flatMap(list -> list.stream()
                        .map(i -> i * 2))
                .toList();
        System.out.println(list2);
    }
}
