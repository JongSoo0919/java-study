package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져옴
        long currentTime = System.currentTimeMillis();
        System.out.println("currentTime = " + currentTime);

        //현재 시간(나노초)를 가져옴
        long currentNanoTime = System.nanoTime();
        System.out.println("currentNanoTime = " + currentNanoTime);

        //환경 변수
        System.out.println("env  = " + System.getenv());

        // 시스템 속성
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열 고속 복사
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length); // 운영체제 에서 직접 실행
        System.out.println("originalArray = " + Arrays.toString(originalArray));
        copiedArray[0] = 'J';
        System.out.println("copied Array = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(-1);


    }
}
