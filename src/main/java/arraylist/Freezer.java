package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {

        List<String> inFreezer = new ArrayList<>();
        inFreezer.add("zöldség");
        inFreezer.add("hal");
        inFreezer.add("jégkrém");
        inFreezer.add("sütemény");
        inFreezer.add("hamburger");

        System.out.println(inFreezer);
        System.out.println(inFreezer.size());

        inFreezer.remove("hal");
        inFreezer.remove("jégkrém");

        System.out.println(inFreezer);
        System.out.println(inFreezer.size());

    }
}
