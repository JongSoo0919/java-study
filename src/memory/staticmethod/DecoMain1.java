package memory.staticmethod;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 util1 = new DecoUtil1();
        System.out.println("before : " + s);
        System.out.println("after : " + util1.deco(s));
    }
}
