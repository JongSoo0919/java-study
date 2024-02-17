package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",16,90);
        Student student2 = new Student();
        initStudent(student2,"학생2",17,75);

        printStudent(student1);
        printStudent(student2);
    }

    public static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    public static void printStudent(Student student) {
        System.out.println("이름 : "+student.name + "나이 : "+student.age+"점수 : "+student.grade);
    }
}
