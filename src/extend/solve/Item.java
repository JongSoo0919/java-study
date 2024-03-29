package extend.solve;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }

    public int getPrice() {
        return price;
    }

}
