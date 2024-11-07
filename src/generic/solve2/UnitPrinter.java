package generic.solve2;

import generic.solve2.unit.BioUnit;
import generic.solve2.unit.Shuttle;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> value) {
        BioUnit unit = value.out();
        System.out.println("이름 : " + unit.getName() + ", HP : " + unit.getHp());
    }

}
