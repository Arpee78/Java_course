package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings = Arrays.asList("Telefon", "Tévé", "WC papír");

        System.out.println(importantThings);

        importantThings.set(2,"Fogkefe");

        System.out.println(importantThings);



    }
}
