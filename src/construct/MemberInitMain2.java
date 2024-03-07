package construct;

public class MemberInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = initMember("user1", 15, 90);

        MemberInit member2 = initMember("user2", 30, 80);

        MemberInit[] members = {member1, member2};
        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 점수 : " + m.grade);
        }
    }
    public static MemberInit initMember(String name, int age, int grade) {
        MemberInit member = new MemberInit();
        member.name = name;
        member.age = age;
        member.grade = grade;

        return member;
    }
}
