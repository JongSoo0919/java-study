package loop;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while(true){
            sum += i;
            i++;
            if (sum > 10) {
                break;
            }
            System.out.println(sum);
        }
    }
}
