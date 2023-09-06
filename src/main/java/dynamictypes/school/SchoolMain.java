package dynamictypes.school;

public class SchoolMain {

    public static void main(String[] args) {
        School school = new School("Iskola",12);
        School primarySchool = new PrimarySchool("Általános iskola", 8);
        School secondarySchool = new School("Középiskola", 4);

        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
