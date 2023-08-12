package stringbasic.university;

public class Person {

    private String name;
    private String email;
    private String ssn;
    private String accountNumber;
    private String phoneNumber;

    public Person(String name, String email, String ssn, String accountNumber, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.ssn = ssn;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
