package access.solve;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("상추", 1000, 4);
        Item item2 = new Item("양파", 2000, 2);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);


        shoppingCart.displayItems();

    }
}
