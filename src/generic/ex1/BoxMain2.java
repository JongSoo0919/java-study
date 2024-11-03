package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);

        Object object = integerBox.get();
        Integer integer = (Integer) object;

        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("100");
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result); //ClassCastException
    }
}
