package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(int age, int grade) {
        this("unnamed", age, grade);
    }
}
