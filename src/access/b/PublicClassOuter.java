package access.b;

//import access.c.DefaultClass1;
//import access.c.DefaultClass2;
import access.c.PublicClass;

public class PublicClassOuter {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지는 접근 불가능
//        DefaultClass1 defaultClass1 = new DefaultClass1();
//        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
