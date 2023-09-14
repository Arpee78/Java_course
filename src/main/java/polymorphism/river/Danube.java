package polymorphism.river;

import java.util.ArrayList;
import java.util.List;

public class Danube extends River {

    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Danube danube = new Danube("Danube", 2850, List.of("Vienna", "Bratislava", "Budapest", "Belgrade"));
        River river = danube;
        Water water = danube;

        System.out.println(danube.getName());
        System.out.println(danube.getLength());
        System.out.println(danube.getCapitals());

        System.out.println();
        System.out.println(river.getName());
        System.out.println(river.getLength());

    }


}
