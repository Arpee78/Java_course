package methodpass.troopers;

public class Position {

    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position positionB) {
        if (positionB == null) {
            throw new IllegalArgumentException("Cannot calculate distance from unknown position");
        }
        double xValue = posX - positionB.getPosX();
        double yValue = posY - positionB.getPosY();
        return Math.sqrt(xValue * xValue + yValue * yValue);
    }
}
