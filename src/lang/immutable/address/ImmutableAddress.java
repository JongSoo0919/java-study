package lang.immutable.address;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String address) {
        this.value = address;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "address='" + value + '\'' +
                '}';
    }
}
