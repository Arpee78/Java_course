package enumtype.solarsystem;

public enum SolarSystem {
    MERCURY(0), VENUS(0), EARTH(1), MARS(2),
    JUPITER(95), SATURN(146), URANUS(27), NEPTUNE(14);

    private final int moonCount;

    SolarSystem(int moonCount) {
        this.moonCount = moonCount;
    }

    public int getMoonCount() {
        return moonCount;
    }
}
