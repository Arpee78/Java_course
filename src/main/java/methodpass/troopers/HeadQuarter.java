package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();

    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
        troopers.add(trooper);
    }

    public void moveClosestTrooper(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null");
        }
        Trooper closest = findClosestTrooper(target);
        if (closest != null) {
            moveTrooper(closest, target);
        }
    }

    public void moveTrooperByName(String name, Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null");
        }
        Trooper trooper = findTrooperByName(name);
        if (trooper != null) {
            moveTrooper(trooper, target);
        }
    }

    private Trooper findTrooperByName(String name) {
        for (Trooper t : troopers) {
            if (t.getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    private Trooper findClosestTrooper(Position target) {
        if (troopers.isEmpty()) {
            return null;
        }
        Trooper closest = troopers.get(0);
        double distance = closest.distanceFrom(target);
        for (Trooper t : troopers) {
            if (t.distanceFrom(target) < closest.distanceFrom(target)) {
                closest = t;
            }
        }
        return closest;
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }
}
