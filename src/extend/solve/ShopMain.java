package extend.solve;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "kim");
        Movie movie = new Movie("영화1", 20000, "dir", "act");

        book.print();
        album.print();
        movie.print();
    }
}
