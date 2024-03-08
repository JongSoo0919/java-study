package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        //public은 어디서도 호출 가능
        accessData.publicField = 100;
        accessData.publicMethod();

        //default는 같은 패키지 내에서만 호출 가능 = > 다른 패키지 이므로 호출 불가
//        accessData.defaultField = 200;
//        accessData.defaultMethod();

        //private은 동일 클래스 내부에서만 가능
//        accessData.privateField = 300;
//        accessData.privateMethod();

        accessData.innerAceess();

    }
}
