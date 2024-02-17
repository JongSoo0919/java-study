package ref.solve;

public class ProductMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createProductOrder("상품1", 1000, 3);
        productOrders[1] = createProductOrder("상품2", 1000, 3);
        productOrders[2] = createProductOrder("상품3", 1000, 3);

        printProductOrder(productOrders);
    }

    public static ProductOrder createProductOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printProductOrder(ProductOrder[] productOrders) {
        int totalSum = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println("productOrder = " + productOrder + "name : " + productOrder.productName + "가격 : " + productOrder.price + "수량 : " + productOrder.quantity);
            totalSum += (productOrder.price * productOrder.quantity);
        }
        System.out.println("totalSum = " + totalSum);
    }
}
