package nested.solve;

public class OuterMain2 {
    public static void main(String[] args) {
        OuterClass2.InnerClass innerClass = new OuterClass2().new InnerClass();
        innerClass.hello();
    }
}
