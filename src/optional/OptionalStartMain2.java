package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {
    private static final Map<Long, String> map = new HashMap<>();
    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }
    public static void main(String[] args) {
        findAndPrint(1L); // 값이 있음
        findAndPrint(3L); // 값이 없음
    }
    // 이름이 있으면 이름을 대문자로출력, 없으면 "UNKNOWN"
    static void findAndPrint(Long id) {
        Optional<String> optName = findNameById(id);
        String name = optName.orElse("UNKNOWN");

        System.out.println(name);
    }


    static Optional<String> findNameById(Long id) {
        String findName = map.get(id);
        Optional<String> optionalName = Optional.ofNullable(findName);
        return optionalName;
    }

}
