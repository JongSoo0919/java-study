package generic.solve2;

import generic.solve2.unit.BioUnit;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T a, T b) {
        return a.getHp() > b.getHp() ? a : b;
    }
}
