package finalparameter;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
//        data = new Data(); // final로 이미 할당했으므로 불가능
        data.value = 20; // 변경 가능
    }
}
