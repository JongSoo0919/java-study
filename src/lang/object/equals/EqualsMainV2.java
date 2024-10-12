package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 v1 = new UserV2("id-100");
        UserV2 v2 = new UserV2("id-100");


        System.out.println("identity = " + (v1 == v2));
        System.out.println("equality = " + v1.equals(v2));

    }
}
