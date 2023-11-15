package collectionsiterator;

public class ChristmasPresent {

    private String description;
    private String NameOfPerson;
    private int price;

    public ChristmasPresent(String description, String NameOfPerson, int price) {
        this.description = description;
        this.NameOfPerson = NameOfPerson;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNameOfPerson() {
        return NameOfPerson;
    }

    public void setNameOfPerson(String nameOfPerson) {
        this.NameOfPerson = nameOfPerson;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
