package algorithmssum.sales;

import java.util.List;

public class SalesAmountSum {

    public int sumSalesAmount(List<Salesperson> salespersons) {
        int sum = 0;

        for (Salesperson actual : salespersons) {
            sum+=actual.getAmount();
        }
        return sum;
    }
}
