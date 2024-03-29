package exceptionclass.course;

public class Course {

    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        validateName(name);
        this.name = name;
        validateBegin(begin);
        this.begin = begin;
    }

    private static void validateBegin(SimpleTime begin) {
        if (begin == null) {
            throw new IllegalArgumentException("Begin is null!");
        }
    }

    private void validateName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name is null!");
        }
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return begin.toString() + ": " + name;
    }
}
