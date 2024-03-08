package access.solve;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
        this.count = 0;
    }

    public void increment(){
        if (isValid()) {
            System.out.println("max 수치를 넘을 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount(){
        return count;
    }

    private boolean isValid() {
        return count >= max;
    }
}
