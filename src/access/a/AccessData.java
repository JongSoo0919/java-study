package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("public Method 호출" + publicField);
    }

    private void privateMethod() {
        System.out.println("private Method 호출" + privateField);
    }

    void defaultMethod(){
        System.out.println("default Method 호츌" + defaultField);
    }

    public void innerAceess() {
        publicField = 10;
        defaultField = 20;
        privateField = 30;

        publicMethod();
        privateMethod();
        defaultMethod();
    }
}
