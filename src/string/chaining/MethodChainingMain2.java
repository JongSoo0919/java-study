package string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder2 = adder.add(1);
        ValueAdder adder3 = adder2.add(2);
        ValueAdder adder4 = adder3.add(3);

        int result = adder4.getValue();
        System.out.println("result = " + result);
    }
}
