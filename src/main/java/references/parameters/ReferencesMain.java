package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person person1;
        Person person2;
        person1 = new Person("John Doe", 23);
        person2 = person1;
        person2.setName("Jimmy");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println();
        int number1 = 24;
        int number2 = number1;
        number2++;
        System.out.println(number1);
        System.out.println(number2);

        System.out.println();
        person1 = new Person("Ryan", 50);
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }


}
