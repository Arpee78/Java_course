package looptypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudyGroup {

    public void printStudyGroups(List<String> students){

        for (String student: students) {
            if (student.length()<=10){
                System.out.println(student);;
            } else {
                System.out.println(student);;
            }
        }

    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kovács József","Nagy Éva","Kiss Dezső","Tóth Imre Lajos");
        new StudyGroup().printStudyGroups(names);
    }


}
