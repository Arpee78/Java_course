package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private List<Student> students = new ArrayList<>();
    private String className;
    private Random random;

    public ClassRecords(String className, Random random) {
        validate(className);
        this.className = className;
        this.random = random;
    }

    public String getClassName() {
        return className;
    }

    public boolean addStudent(String name) {
        validate(name);

        for (Student s : students) {
            if (s.getName().equals(name)) {
                return false;
            }
        }
        return students.add(new Student(name));
    }

    public boolean removeStudent(String name) {
        validate(name);
        Student student = null;
        for (Student s : students) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        if (student == null) {
            return false;
        }
        return  students.remove(student);
    }

    private void validate(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
    }

    public double calculateClassAverageBySubject(String subjectName) {
        validate(subjectName);
        double sum = 0;
        int count = 0;
        for (Student s : students) {
            double average = s.calculateSubjectAverage(subjectName);
            if (average > 0) {
                sum += average;
                count++;
            }
        }
        return Math.round(sum * 100.0 / count) / 100.0;
    }

    public Student findStudentByName(String name) {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students to search!");
        }
        validate(name);
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        throw new IllegalArgumentException("No student found with name: "+name);
    }

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size()));
    }

    public List<SubjectResult> listSubjectResults(String subjectName) {
        validate(subjectName);
        List<SubjectResult> result = new ArrayList<>();
        for (Student s : students) {
            double average = s.calculateSubjectAverage(subjectName);
            if (average > 0) {
                result.add(new SubjectResult(s.getName(), average));
            }
        }
        return result;
    }

    public String listStudentNames() {
        StringBuilder sb = new StringBuilder();
        for (Student s : students) {
            sb.append(s.getName());
            if (s != students.get(students.size() - 1)) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

}
