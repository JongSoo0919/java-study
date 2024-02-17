package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data d = new Data();
        d.value = 10;
        System.out.println("d = " + d);
        System.out.println("메서드 호출 전 : "+d.value);
        change(d);
        System.out.println("메서드 호출 후 : "+d.value);
    }
    public static void change(Data d){
        System.out.println("d = " + d);
        d.value = 20;
    }
}
