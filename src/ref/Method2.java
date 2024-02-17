package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 16, 90);
        System.out.println("student1 = " + student1);
        Student student2 = createStudent("학생2", 17, 75);
        System.out.println("student2 = " + student2);

        printStudent(student1);
        printStudent(student2);
    }

    public static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("참조 값 : " + student);
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }
    public static void printStudent(Student student) {
        System.out.println("이름 : "+student.name + "나이 : "+student.age+"점수 : "+student.grade);
    }
}
