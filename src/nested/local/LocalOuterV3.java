package nested.local;

import java.util.Arrays;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거.

        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void print() {
                // 인스턴스는 지역 변수보다 더 오래 살아남음.
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
//        localPrinter.print();
        return localPrinter; // Printer 인스턴스 반환
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer localPrinter = localOuter.process(2);
        //printer.print()를 나중에 실행, process()의 스택 프레임이 사라진 이후 실행
        localPrinter.print();

        //추가
        System.out.println("필드 확인");
        Arrays.stream(localPrinter.getClass().getDeclaredFields()).forEach(System.out::println);
    }
}
