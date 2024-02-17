package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 10;
        Data data2 = data;

        System.out.println("data = " + data);
        System.out.println("data2 = " + data2);
        System.out.println("data.value = " + data.value);
        System.out.println("data2.value = " + data2.value);

        //data.value변경
        data.value = 20;
        System.out.println("data.value = " + data.value);
        System.out.println("data2.value = " + data2.value);
        
        //data2.value변경
        data2.value = 30;
        System.out.println("data.value = " + data.value);
        System.out.println("data2.value = " + data2.value);
    }
}
