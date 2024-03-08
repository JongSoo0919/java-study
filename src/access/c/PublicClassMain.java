package access.c;

public class PublicClassMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1(); //같은 패키지이므로 생성 가능
        DefaultClass2 defaultClass2 = new DefaultClass2(); //같은 패키지이므로 생성 가능
    }
}
