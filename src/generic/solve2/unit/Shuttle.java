package generic.solve2.unit;

public class Shuttle <T extends BioUnit> {
    private T value;
    public void in(T t) {
        this.value = t;
    }
    public void showInfo() {
        System.out.println("이름 : " + value.getName() + ", HP : " + value.getHp());
    }
    public T out() {
        return value;
    }
}
