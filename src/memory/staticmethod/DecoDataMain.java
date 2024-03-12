package memory.staticmethod;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출 1");
        DecoData decoData1 = new DecoData();
        decoData1.instanceCall();

        System.out.println("3. 인스턴스 호출 2");
        DecoData decoData2 = new DecoData();
        decoData2.instanceCall();

        decoData1.staticCall();
        decoData2.staticCall();
    }
}
