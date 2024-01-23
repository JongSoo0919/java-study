package method;

/***
 * 반환 타입, 매개 변수가 없는 메서드 정의
 */
public class Method3 {
    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램 동작");
        printFooter();
    }
    public static void printHeader(){
        System.out.println("프로그램을 시작합니다.");
    }
    public static void printFooter(){
        System.out.println("프로그램을 종료합니다.");
    }
}
