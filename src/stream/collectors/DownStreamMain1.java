package stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DownStreamMain1 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Kim", 1, 85),
                new Student("Park", 1, 70),
                new Student("Lee", 2, 70),
                new Student("Han", 2, 90),
                new Student("Hoon", 3, 90),
                new Student("Ha", 3, 89)
        );

        // 1. 학년 별 그룹화
        Map<Integer, List<Student>> collect1_1 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade // 그룹화 기준 : 학년 (key 1,2,3 grade)
//                        ,Collectors.toList() // 생략 가능, 기본 toList()
                ));
        System.out.println(collect1_1);

        // 2. 학년 별 학생들의 이름
        Map<Integer, List<String>> collect1_2 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.mapping(Student::getName, // 다운 스트림 1 : 학생 -> 1 : 이름 으로 매핑
                                Collectors.toList())
                ));
        System.out.println(collect1_2);

        // 3. 학년 별 학생 수
        Map<Integer, Long> collect1_3 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.counting()
                ));
        System.out.println(collect1_3);

        // 4. 학년 별 학생 평균 성적
        Map<Integer, Double> collect1_4 = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGrade,
                        Collectors.averagingInt(Student::getScore)
                ));
        System.out.println(collect1_4);
    }
}
