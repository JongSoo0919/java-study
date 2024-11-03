package generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox<Object> integerBox = new GenericBox<>(); // 권장
//        GenericBox integerBox = new GenericBox(); // 권장하지 않음, 아무것도 안넣으면 Object
    }
}
