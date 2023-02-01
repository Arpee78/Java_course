package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Daniel Defoe", "Robinson Crusoe");

        book.register("123");

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());
    }
}
