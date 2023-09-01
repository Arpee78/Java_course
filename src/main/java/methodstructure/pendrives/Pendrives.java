package methodstructure.pendrives;

import java.util.List;

public class Pendrives {

    public Pendrive getBest(List<Pendrive> pendrives) {
        Pendrive best = pendrives.get(0);

        for (Pendrive p : pendrives) {
            if (best.comparePricePerCapacity(p) == 1) {
                best = p;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendrives) {
        Pendrive cheapest = pendrives.get(0);

        for (Pendrive p : pendrives) {
            if (p.isCheaperThan(cheapest)) {
                cheapest = p;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive p : pendrives) {
            if (p.getCapacity() == capacity) {
                p.risePrice(percent);
            }
        }
    }

}
