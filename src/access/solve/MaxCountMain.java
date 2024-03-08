package access.solve;

public class MaxCountMain {
    public static void main(String[] args) {
        MaxCounter maxCounter = new MaxCounter(10);
        for (int i = 0; i < 12; i++) {
            maxCounter.increment();
        } 

        System.out.println(maxCounter.getCount());
    }
}
