package memory.staticmethod;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello java";
        System.out.println("before : " + s);
        System.out.println("after : " + DecoUtil2.deco(s));

    }
}
