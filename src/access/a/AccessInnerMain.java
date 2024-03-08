package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData accessData = new AccessData();
        //public은 어디서도 호출 가능
        accessData.publicField = 100;
        accessData.publicMethod();

        //default는 같은 패키지 내에서만 호출 가능
        accessData.defaultField = 200;
        accessData.defaultMethod();

        //private은 동일 클래스 내부에서만 가능
//        accessData.privateField = 300;
//        accessData.privateMethod();

        accessData.innerAceess();

    }
}
