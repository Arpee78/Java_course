package exam_sv2_part2.city;

public class Address {

    private String street;
    private int buildingNumber;

    public Address(String street, int buildingNumber) {
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }
}
