package nested.solve.ex1;

import java.util.Arrays;

public class Library {
    private final Book[] books;

    public Library(int x) {
        this.books = new Book[x];
    }

    public void addBook(String title, String author) {
        int index = getLastBookIndex();
        if(index == -1) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }

        books[index] = new Book(title, author);
    }

    private int getLastBookIndex () {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }

        return -1;
    }

    private record Book(String title, String author) {
        @Override
        public String toString() {
            return "도서 제목 : " + title + ", 저자 : " + author;
        }
    }



    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        Arrays.stream(books).forEach(System.out::println);
    }
}
