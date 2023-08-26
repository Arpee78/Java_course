package algorithmsmax.sales;

import java.util.List;

public class Sales {

    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson salesperson = sales.get(0);

        for (Salesperson actual : sales) {
            if (actual.getAmount() > salesperson.getAmount()) {
                salesperson = actual;
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson salesperson = sales.get(0);

        for (Salesperson actual : sales) {
            if (actual.getDifferenceFromTarget() > salesperson.getDifferenceFromTarget()) {
                salesperson = actual;
            }
        }
        return salesperson;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson salesperson = sales.get(0);

        for (Salesperson actual : sales) {
            if (actual.getAmount() < salesperson.getAmount()) {
                salesperson = actual;
            }
        }
        return salesperson;
    }

}
