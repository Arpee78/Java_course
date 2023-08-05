package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students){

        List<String> shortNames1 = new ArrayList<>();
        List<String> longNames2 = new ArrayList<>();

        for (String student: students) {
            if (student.length()<=10){
                shortNames1.add(student);
            } else {
                longNames2.add(student);
            }
        }

        System.out.println("1. csoport: " + shortNames1);
        System.out.println("2. csoport: " + longNames2);

    }

    public static void main(String[] args) {
        new StudyGroup().printStudyGroups(Arrays.asList("Kovács József","Nagy Éva","Kiss Dezső","Tóth Imre Lajos"));
    }


}
