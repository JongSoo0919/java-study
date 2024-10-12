package string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb.toString() = " + sb.toString());

        // 문자열 추가
        sb.insert(4, "Java");
        System.out.println("sb.toString() = " + sb.toString());

        // 문자열 삭제
        sb.delete(4, 8);
        System.out.println("sb.toString() = " + sb.toString());

        // 문자열 뒤집기
        sb.reverse();
        System.out.println("sb.toString() = " + sb.toString());


    }
}
