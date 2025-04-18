package lambda.start;

public class Ex0Ref {
    public static void hello(String str) {
        System.out.println("프로그램 시작"); //변하지 않는 부분
        System.out.println(str); // 변하는 부분
        System.out.println("프로그램 종료"); //변하지 않는 부분
    }

    public static void main(String[] args) {
        hello("hello java");
        hello("hello spring");
    }
}
