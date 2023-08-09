package enumtype.university;

public enum University {
    BME("Budapesti Műszaki Egyetem"), ELTE("Eötvös Loránd Tudományegyetem"), SZFE("Színház- és Filmművészeti Egyetem");

    private final String name;

    public String getName() {
        return name;
    }

    University(String name) {
        this.name = name;
    }


}
