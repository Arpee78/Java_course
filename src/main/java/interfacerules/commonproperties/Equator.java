package interfacerules.commonproperties;

public class Equator implements Name, Length {

    public static final double LENGTH = 40_075.0;
    public static final String NAME = "Equator";

    @Override
    public double getLength() {
        return LENGTH;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
