package methodpass.troopers;

public class Trooper {

    private String name;
    private Position position;


    public Trooper(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;
        position = new Position(0, 0);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public void changePosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("The new position must not be null");
        }
        position = target;
    }

    public double distanceFrom(Position position) {
        return this.position.distanceFrom(position);
    }
}
