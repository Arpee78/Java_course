package introexceptionwritefiletestjunit4;

public class Book {

    private String code;
    private String title;
    private String author;

    public Book(String code, String title, String author) {
        this.code = code;
        this.title = title;
        this.author = author;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
