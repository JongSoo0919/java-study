package construct;

public class MemberInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit("user1", 15, 90);

        MemberInit member2 = new MemberInit("user2", 30, 80);

        MemberInit[] members = {member1, member2};
        for (MemberInit m : members) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 점수 : " + m.grade);
        }
    }
}
