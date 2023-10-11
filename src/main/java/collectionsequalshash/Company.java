package collectionsequalshash;

import java.util.Objects;

public class Company {

    private String name;
    private String taxNumber;

    public Company(String name, String taxNumber) {
        this.name = name;
        this.taxNumber = taxNumber;
    }

    public String getName() {
        return name;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (!Objects.equals(name, company.name)) return false;
        return Objects.equals(taxNumber, company.taxNumber);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (taxNumber != null ? taxNumber.hashCode() : 0);
        return result;
    }
}
