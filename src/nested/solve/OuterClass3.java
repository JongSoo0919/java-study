package nested.solve;

public class OuterClass3 {
    public void myMethod() {
        class LocalClass {
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass lc = new LocalClass();
        lc.hello();
    }
}
