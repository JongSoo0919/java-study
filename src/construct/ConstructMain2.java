package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
//        MemberConstruct memberConstruct = new MemberConstruct(); // 오류
        MemberConstruct memberConstruct = new MemberConstruct("user1", 15, 90);
        MemberConstruct memberConstruct2 = new MemberConstruct( 30, 80);
        MemberConstruct[] memberConstructs = {memberConstruct, memberConstruct2};

        for (MemberConstruct m : memberConstructs) {
            System.out.println("이름 : " + m.name + " 나이 : " + m.age + " 점수 : " + m.grade);
        }
    }
}
