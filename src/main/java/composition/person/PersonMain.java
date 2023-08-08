package composition.person;

public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person("John Doe", "123456");
        System.out.println(person.personToString());
        person.moveTo(new Address("country: USA", "   city: New York", "   street&N: Mexico street 1", "   zip: 10001"));
        System.out.println(person.getAddress().addressToString());

    }
}
