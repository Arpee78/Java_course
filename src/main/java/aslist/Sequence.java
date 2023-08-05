package aslist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>(Arrays.asList(1,2));

        for (int i = 0; i < 5; i++) {
            int l = elements.size();
            elements.add(elements.get(l-2)*elements.get(l-1));
        }
        System.out.println(elements);
        System.out.println(elements.size());
    }
}
