package exam_sv2_part2.city;

public class Office extends Building {

    private String company;
    private int numberOfTablesPerLevel;

    public Office(int area, Address address, String company, int numberOfTablesPerLevel) {
        super(area, address);
        validateNumberOfTables(area, numberOfTablesPerLevel);
        this.numberOfTablesPerLevel = numberOfTablesPerLevel;
        this.company = company;
    }

    public Office(int area, int levels, Address address, String company, int numberOfTablesPerLevel) {
        super(area, levels, address);
        validateNumberOfTables(area, numberOfTablesPerLevel);
        this.company = company;
        this.numberOfTablesPerLevel = numberOfTablesPerLevel;
    }

    private void validateNumberOfTables(int area, int numberOfTablesPerLevel) {
        double tablesPerArea = 1.0 * getArea() / numberOfTablesPerLevel;
        if (tablesPerArea < 2 || tablesPerArea > 5) {
            throw new IllegalArgumentException("Number of tables is incorrect.");
        }
    }

    public String getCompany() {
        return company;
    }

    public int getNumberOfTablesPerLevel() {
        return numberOfTablesPerLevel;
    }

    @Override
    public int calculateNumberOfPeopleCanFit() {
        return numberOfTablesPerLevel * (getLevels() - 1);
    }
}
