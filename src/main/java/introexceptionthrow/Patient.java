package introexceptionthrow;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A név nem lehet üres");
        }
        this.name = name;
        this.socialSecurityNumber = ssn;
        if (yearOfBirth < 1900) {
            throw new IllegalArgumentException("A születési évnek legalább 1900-nak kell lennie");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public static void main(String[] args) {
        Patient firstPatient = new Patient("Kiss József", "123456788", 1954);

        System.out.println(firstPatient.getName());
        System.out.println(firstPatient.getSocialSecurityNumber());
        System.out.println(firstPatient.getYearOfBirth());

        Patient secondPatient = new Patient("", "123456788", 1954);

        System.out.println(secondPatient.getName());
        System.out.println(secondPatient.getSocialSecurityNumber());
        System.out.println(secondPatient.getYearOfBirth());

        Patient thirdPatient = new Patient("Kiss József", "123456788", 1888);

        System.out.println(thirdPatient.getName());
        System.out.println(thirdPatient.getSocialSecurityNumber());
        System.out.println(thirdPatient.getYearOfBirth());
    }
}
