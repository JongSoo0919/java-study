package stream.collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Basic {
    public static void main(String[] args) {
        // Map으로 변환 가능
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length() // value
                ));
        System.out.println(map1);

//        // key가 중복이라면, 중복 에러
//        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomato")
//                .collect(Collectors.toMap(
//                        name -> name, // key
//                        name -> name.length() // value
//                ));
//        System.out.println(map2);

        // 키 중복 대안 (병합)
        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length(), // value
                        (oldValue, newValue) -> oldValue + newValue // 중복될 경우에 대한 처리
                ));

        // Map 타입 지정
        Map<String, Integer> map4 = Stream.of("Apple", "Apple", "Tomato")
                .collect(Collectors.toMap(
                        name -> name, // key
                        name -> name.length(), // value
                        (oldValue, newValue) -> oldValue + newValue, // 중복될 경우에 대한 처리
                        LinkedHashMap::new // 타입 지정 시 원하는 타입으로 변경
                ));
        System.out.println(map4.getClass());
    }
}
