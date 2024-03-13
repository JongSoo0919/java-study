package extend.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.public");
    }

    private void privateMethod() {
        System.out.println("Parent.private");
    }

    void defaultMethod() {
        System.out.println("Parent.default");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protected");
    }

    public void printParent() {
        System.out.println("==Parent 메서드==");
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        publicMethod();
        defaultMethod();
        privateMethod();
        protectedMethod();
    }

}
