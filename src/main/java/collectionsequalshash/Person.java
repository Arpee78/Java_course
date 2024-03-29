package collectionsequalshash;

import java.util.Objects;

public class Person {

    private String name;
    private int age;
    private String ssn;

    public Person(String name, int age, String ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return Objects.equals(ssn, person.ssn);
    }

    @Override
    public int hashCode() {
        return ssn != null ? ssn.hashCode() : 0;
    }

    public static void main(String[] args) {
        Person person = new Person("Kiss József", 45, "111111110");
        Person anotherPerson = new Person("Nagy Béla", 32, "111111110");

        System.out.println(person.equals(anotherPerson));
        System.out.println(anotherPerson.equals(person));

        System.out.println(person.hashCode());
        System.out.println(anotherPerson.hashCode());
    }
}
