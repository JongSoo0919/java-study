package stream.collectors;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors1Basic {
    public static void main(String[] args) {
        // 수정 가능 List 반환
        List<String> list = Stream.of("Java", "Spring", "JPA")
                .collect(Collectors.toList());
        list.add("Hello");
        System.out.println(list);

        // 수정 불가능 List 반환
        List<Integer> unmodifiableList = Stream.of(1, 2, 3)
                .collect(Collectors.toUnmodifiableList());
//        unmodifiableList.add(4); //
        System.out.println(unmodifiableList);

        // Set
        Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
                .collect(Collectors.toSet());
        System.out.println(set);

        // 타입 지정
        TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1,7)
                .collect(Collectors.toCollection(TreeSet::new)); // TreeSet은 정렬 상태를 유지
        treeSet.add(6);
        System.out.println(treeSet);
    }
}
