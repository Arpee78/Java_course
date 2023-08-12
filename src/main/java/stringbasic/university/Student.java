package stringbasic.university;

public class Student {

    private Person person;
    private String neptuneCode;
    private String educationID;
    private String accessCardNumber;

    public Student(Person person, String neptuneCode, String educationID) {
        this.person = person;
        this.neptuneCode = neptuneCode;
        this.educationID = educationID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptuneCode() {
        return neptuneCode;
    }

    public void setNeptuneCode(String neptuneCode) {
        this.neptuneCode = neptuneCode;
    }

    public String getEducationID() {
        return educationID;
    }

    public void setEducationID(String educationID) {
        this.educationID = educationID;
    }

    public String getAccessCardNumber() {
        return accessCardNumber;
    }

    public void setAccessCardNumber(String accessCardNumber) {
        this.accessCardNumber = accessCardNumber;
    }
}
