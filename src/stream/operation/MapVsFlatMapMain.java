package stream.operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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

        List<List<List<String>>> company = List.of(
                // 회사 A
                List.of(
                        List.of("Alice", "Bob"),       // 부서 A-1
                        List.of("Charlie", "Diana")    // 부서 A-2
                ),
                // 회사 B
                List.of(
                        List.of("Eve", "Frank"),        // 부서 B-1
                        List.of("Jerry", "Tom")         // 부서 B-2
                )
        );
        // 회사 A의 부서 A-2의 2번째 직원 Diana
        System.out.println(company.get(0).get(1).get(1));

        //flatMap 으로 표현
        // 부서를 없애고, 회사로 표현
        List<List<String>> company2 = company.stream()
                .flatMap(list -> list.stream())
                .toList();
        System.out.println(company2);

        List<String> company3 = company.stream()
                .flatMap(list -> list.stream())
                .flatMap(dept -> dept.stream())
                .map(String::toUpperCase)
                .toList();
        System.out.println(company3);

        List<String> company4 = company.stream()
                .flatMap(list -> list.stream()
                        .flatMap(dept -> dept.stream()))
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println(company4);
    }
}
