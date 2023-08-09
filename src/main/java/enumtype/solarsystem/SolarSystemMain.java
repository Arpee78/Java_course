package enumtype.solarsystem;

public class SolarSystemMain {

    public static void main(String[] args) {

        System.out.println("The number of moons of the planets.");
        for (SolarSystem s: SolarSystem.values()) {
            System.out.println(s + ": " + s.getMoonCount());
        }
    }
}
