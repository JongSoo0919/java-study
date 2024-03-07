package construct.solve;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.displayInfo());

        Book book2 = new Book("Hello Java!", "Seo");
        System.out.println(book2.displayInfo());

        Book book3 = new Book("JPA 프로그래밍", "Kim", 700);
        System.out.println(book3.displayInfo());


    }
}
