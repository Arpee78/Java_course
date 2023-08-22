package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLetter {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Alma", "Banán", "Cseresznye", null, "Durián"));

        try {
            for (String actual : words) {
                System.out.print(actual.charAt(0) + " ");
            }
        } catch (NullPointerException npe) {
            System.out.println("Üres elem a listában");
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        }

    }
}
