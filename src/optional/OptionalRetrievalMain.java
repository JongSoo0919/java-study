package optional;

import java.util.Optional;

public class OptionalRetrievalMain {
    public static void main(String[] args) {
        // 예제 : 문자열 "Java"가 있는 Optional과 비어있는 Optional
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // isPresent : 값이 있으면 true
        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());

        // get : 직접 내부 값을 꺼냄, 없으면 NoSuchElementException
        String getValue = optValue.get();
        System.out.println("getValue = " + getValue);
//        String emptyValue = optEmpty.get(); // 예외 발생
//        System.out.println(emptyValue);

        // orElse : 있으면 그 값, 없으면 대체 값
        String value1 = optValue.orElse("기본값");
        String empty1 = optEmpty.orElse("기본값");
        System.out.println("value1 = " + value1);
        System.out.println("empty1 = " + empty1);

        // orElseGet : 값이 없을 때만 람다(Supplier)가 실행되어 기본 값 생성
        String value2 = optValue.orElseGet(() -> {
            System.out.println("람다 호출");
            return "New Value";
        });

        String empty2 = optEmpty.orElseGet(() -> {
            System.out.println("람다 호출");
            return "New Value";
        });
        System.out.println("value2 = " + value2);
        System.out.println("empty2 = " + empty2);
        
        // orElseThrow : 값이 있으면 반환, 없으면 예외
        String value3 = optValue.orElseThrow(() -> new RuntimeException("값 X"));
        System.out.println("value3 = " + value3);
//        String empty3 = optEmpty.orElseThrow(RuntimeException::new); // 예외 발생
//        System.out.println("empty3 = " + empty3);

        // or : Optional을 반환
        Optional<String> result1 = optValue.or(() -> Optional.of("Hello"));
        Optional<String> result2 = optEmpty.or(() -> Optional.of("Fallback"));
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
