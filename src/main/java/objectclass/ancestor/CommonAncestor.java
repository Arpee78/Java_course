package objectclass.ancestor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAncestor {

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        Fruit fruit = new Fruit();
        objects.add(fruit);
        Apple apple = new Apple();
        objects.add(apple);
        Starking starking = new Starking();
        objects.add(starking);
        Vegetable vegetable = new Vegetable();
        objects.add(vegetable);
        objects.add("alma");
        objects.add(12);
        objects.add('x');
        LocalDate localDate = LocalDate.of(1978,06,06);
        objects.add(localDate);
        List<String> strings = List.of("a1","b1","c1");
        objects.add(strings);
        System.out.println(objects);

    }
}
