package stream.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DownStreamMain2 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Han", 2, 90),
                new Student("Hoon", 3, 90),
                new Student("Ha", 3, 89)
        );

        // 1. 학년 별로 학생들 그룹화
        Map<Integer, List<Student>> collect1 = students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
        System.out.println(collect1);

        // 2. 학년 별로 가장 점수가 높은 학생, reducing
        Map<Integer, Optional<Student>> collect2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade
                        , Collectors.reducing((s1, s2) -> s1.getScore() > s2.getScore() ? s1 : s2) // 계속해서 비교해서 가장 큰 사람 한명만 구해짐.
                ));
        System.out.println(collect2);

        // 3. 학년 별로 가장 점수가 높은 학생, maxBy
        Map<Integer, Optional<Student>> collect3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
//                        Collectors.maxBy((s1, s2) -> s1.getScore() - s2.getScore())
//                        Collectors.maxBy(Comparator.comparingInt(Student::getScore))
                        Collectors.minBy(Comparator.comparingInt(Student::getScore))
                ));
        System.out.println(collect3);

        // 4. 학년 별로 가장 점수가 높은 학생의 이름 (collectingAndThen + maxBy)
        // 학년 별 그룹 -> 그룹별 가장 점수가 높은 학생 -> 이름 매핑
        Map<Integer, String> collect4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
//                        Collectors.maxBy(Comparator.comparingInt(Student::getScore))
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(Student::getScore)),
                                optionalStudent -> optionalStudent.get().getName()
                        )
                ));
        System.out.println(collect4);


    }

}