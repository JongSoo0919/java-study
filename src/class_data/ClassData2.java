package class_data;

public class ClassData2 {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "학생1";
        students[0].age = 15;
        students[0].grade = 90;

        students[1] = new Student();
        students[1].name = "학생2";
        students[1].age = 16;
        students[1].grade = 80;

        for (Student student : students) {
            System.out.println(student);
        }

        String [] strings = new String[2];
        strings[0] = "hello";
        strings[1] = "world";

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
