package algorithmstransformation.students;

import java.util.ArrayList;
import java.util.List;

public class PrimarySchool {

    private List<Person> people;

    public PrimarySchool(List<Person> people) {
        this.people = people;
    }

    public List<Person> getPeople() {
        return new ArrayList<>(people);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Person p : people) {
            int age = p.getAge();
            if (age >= 6 && age<=14)
                students.add(new Student(p.getName(),p.getAddress()));
        }
        return students;
    }


}
