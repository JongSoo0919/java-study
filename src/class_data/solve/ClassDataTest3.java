package class_data.solve;

public class ClassDataTest3 {
    public static void main(String[] args) {
        ProductOrder[] productOrder = new ProductOrder[3];
        productOrder[0] = new ProductOrder();
        productOrder[0].productName = "두부";
        productOrder[0].price = 2000;
        productOrder[0].quantity = 2;

        productOrder[1] = new ProductOrder();
        productOrder[1].productName = "김치";
        productOrder[1].price = 5000;
        productOrder[1].quantity = 1;

        productOrder[2] = new ProductOrder();
        productOrder[2].productName = "콜라";
        productOrder[2].price = 1500;
        productOrder[2].quantity = 2;

        int totalAmount = 0;
        for (ProductOrder p : productOrder) {
            System.out.println("상품명 : " + p.productName + "가격 : " + p.price + " 수량 : " + p.quantity);
            totalAmount += p.price * p.quantity;
        }
        System.out.println(totalAmount);
    }
}
