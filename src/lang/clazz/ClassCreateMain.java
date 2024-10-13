package lang.clazz;

import java.util.Scanner;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        // 동적으로 객체를 만드는 것이 가능, 즉 사용자의 입력에 맞추어 사용자가 입력을 Hello가 아닌 Bye로 하면 Bye 클래스를 만들 수 있는 것.
//        Class helloClass = Hello.class;
        Scanner sc = new Scanner(System.in);
        //lang.clazz.Hello / lang.clazz.Bye
        Class helloClass = Class.forName(sc.nextLine());

        Test object = (Test) helloClass.getDeclaredConstructor().newInstance();
        System.out.println(object.hello());
    }
}
