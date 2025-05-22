package optional;

import java.util.Optional;

public class OptionalProcessingMain {
    public static void main(String[] args) {
        Optional<String> optValue = Optional.of("Hello");
        Optional<String> optEmpty = Optional.empty();

        // 값이 존재하면 Consumer 실행, 없으면 아무것도 실행하지 않음.
        optValue.ifPresent(v -> System.out.println("optValue 값 = " + v));
        optEmpty.ifPresent(v -> System.out.println("optEmpty 값 = " + v));

        // 값이 있으면 consumer 실행, 없으면 runnable 실행
        // 값이 있으면 인자가 있으므로 Consumer, 값이 없으면 인자가 없으므로 Runnable
        optValue.ifPresentOrElse(
                v -> System.out.println("optValue 값 = " + v)
                , () -> System.out.println("optValue 비어있음.")
        );
        optEmpty.ifPresentOrElse(
                v -> System.out.println("optEmpty 값 = " + v)
                , () -> System.out.println("optEmpty 비어있음.")
        );

        // 값이 있으면 Function 적용 후 Optional로 변환, 없으면 empty
        Optional<Integer> lengthOpt1 = optValue.map(String::length);
        System.out.println("lengthOpt1 = " + lengthOpt1);
        Optional<Integer> lengthOpt2 = optEmpty.map(String::length);
        System.out.println("lengthOpt2 = " + lengthOpt2);

        // map()과 유사하나, Optional을 반환하는 경우 중첩을 제거
        Optional<Optional<String>> nestedOpt = optValue.map(Optional::of);
        System.out.println("nestedOpt = " + nestedOpt);
        Optional<String> flattenedOpt = optValue.flatMap(Optional::of);
        System.out.println("flattenedOpt = " + flattenedOpt);

        // 값이 있고 조건을 만족하면 그 값 그대로, 불만족시 empty
        Optional<String> filtered1 = optValue.filter(s -> s.length() == 5);
        System.out.println("filtered1 = " + filtered1);
        Optional<String> filtered2 = optValue.filter(s -> s.length() == 6);
        System.out.println("filtered2 = " + filtered2);

        // 값이 있으면 단일 요소 스트림, 없으면 빈 스트림
        optValue.stream()
                .forEach(s -> System.out.println("optValue.stream() -> " + s)); // 값이 있으므로 실행
        optEmpty.stream()
                .forEach(s -> System.out.println("optEmpty.stream() -> " + s)); // 값이 없으므로 실행 X
    }
}
