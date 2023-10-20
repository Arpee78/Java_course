package collectionsqueue;

import java.util.*;

public class Vaccination {

    public Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> order = new PriorityQueue<>();
        for (Person p : people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                order.add(p.getAge());
            }
        }
        return order;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        List<Person> people = new ArrayList<>();

        people.add(new Person("Józsi", 16));
        people.add(new Person("Kati", 26));
        people.add(new Person("Sanyi", 19));
        people.add(new Person("Éva", 62));
        people.add(new Person("Géza", 74));

        Queue<Integer> order = vaccination.getVaccinationOrder(people);
        System.out.println(order);
        System.out.println(order.poll());
        System.out.println(order.poll());
        System.out.println(order.poll());

    }
}
