package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {

    private List<ChristmasPresent> christmasPresents;

    public ChristmasShopping(List<ChristmasPresent> christmasPresents) {
        this.christmasPresents = christmasPresents;
    }

    public List<ChristmasPresent> getChristmasPresents() {
        return new ArrayList<>(christmasPresents);
    }

    public void addNewPresent(ChristmasPresent present) {
        christmasPresents.add(present);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for (Iterator<ChristmasPresent> actual = christmasPresents.iterator(); actual.hasNext(); ) {
            ChristmasPresent c = actual.next();
            if (c.getPrice() > maxPrice) {
                actual.remove();
            }
        }
    }

}
