package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle() {
        String name = title != null ? title.getTitle() + " " : "";
        name += givenName + " ";
        name += middleName != null ? middleName + " " : "";
        name += familyName;
        return name;
    }

    public String concatNameHungarianStyle() {
        String name = title == Title.DR ? title.getTitle() + " " : "";
        name += familyName + " ";
        name += middleName != null ? middleName + " " : "";
        name += givenName;
        return name;
    }
}
