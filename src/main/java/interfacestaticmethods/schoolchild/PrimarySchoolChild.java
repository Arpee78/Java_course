package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {

        if (age >= 6 && age <= 10) {
            return new LowerClassSchoolChild(age);
        }

        if (age >= 11 && age <= 14) {
            return new UpperClassSchoolChild(age);
        }

        throw new IllegalArgumentException("It's not a schoolchild with this age!");
    }

}
