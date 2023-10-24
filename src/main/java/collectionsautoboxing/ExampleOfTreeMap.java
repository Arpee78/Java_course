package collectionsautoboxing;

import java.util.TreeMap;

class ExampleOfTreeMap {
    public static void main(String arg[]) {
        TreeMap<Integer, String> listOfNames = new TreeMap<Integer, String>();
        listOfNames.put(3, "C");
        listOfNames.put(1, "A");
        listOfNames.put(2, "D");
        listOfNames.put(6, "B");
        listOfNames.put(8, "B");

        // It return the greatest Key of TreeMap
        System.out.println("Greatest Key of TreeMap:" + listOfNames.lastKey());
    }
}
