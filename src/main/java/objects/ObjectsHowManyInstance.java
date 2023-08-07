package objects;

public class ObjectsHowManyInstance {

    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = book1;
        Book book5 = book1;
        Book book6 = book3;
        Book book7 = null;
        book4 = book6;
        new Book();
        book5 = new Book();
        book6 = null;
        book5 = book4;

        // A végére 5 objektum jön létre,
        // amiből 3 objektumhoz férünk hozzá.

    }
}
