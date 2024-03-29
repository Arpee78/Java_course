package exam_sv2_part1_sup.teahouse;

public class Tea {

    private String name;
    private int price;
    private Sort sort;

    public Tea(String name, int price, Sort sort) {
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Sort getSort() {
        return sort;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": "+ sort.getAdditionalInfo()+ " ("+price+" Ft)";
    }
    // Earl Grey: élénkítő hatású (1837 Ft)
}
