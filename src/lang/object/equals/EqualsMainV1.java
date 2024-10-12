package lang.object.equals;

import pack.a.User;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 v1 = new UserV1("id-100");
        UserV1 v2 = new UserV1("id-100");


        System.out.println("identity = " + (v1 == v2));
        System.out.println("equality = " + v1.equals(v2));

    }
}
