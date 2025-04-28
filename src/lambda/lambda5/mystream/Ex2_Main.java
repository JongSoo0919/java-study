package lambda.lambda5.mystream;

import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMap;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex2_Main {
    public static void main(String[] args) {
        // 점수가 80점 이상인 학생의 이름을 추출해라. List<Student> students = List.of(
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        direct(students);

        List<String> result = map(filter(students, student -> student.getScore() >= 80), student -> student.getName());
        Runnable runnable = () -> result.forEach(System.out::println);
        lambda(runnable);

        List<String> res = lambda(students);
        res.forEach(System.out::println);

    }

    public static List<Student> filter (List<Student> students, Predicate<Student> predicate) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public static List<String> map (List<Student> students, Function<Student, String> function) {
        List<String> result = new ArrayList<>();
        for(Student student : students) {
            result.add(function.apply(student));
        }
        return result;
    }

    public static List<String> lambda (List<Student> students) {
        List<Student> filteredStudents = GenericFilter.filter(students, student -> student.getScore() >= 80);
        List<String> mapStudents = GenericMap.map(filteredStudents, student -> student.getName());
        return mapStudents;
    }

    public static void lambda(Runnable runnable) {
        runnable.run();
    }

    public static void direct(List<Student> students) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getScore() >= 80) {
                result.add(student);
            }
        }

        for (Student student : result) {
            System.out.println(student.getName());
        }
    }
}
