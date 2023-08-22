package exam_sv2_part1_sup.teahouse;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeaHouse {

    private String name;
    private List<Tea> teas;
    private LocalTime openTime;
    private LocalTime closeTime;

    public TeaHouse(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        Tea tea1 = new Tea("Kamillavirágzat", 1256, Sort.HERBAL_TEA);
        Tea tea2 = new Tea("Cseresznyés álom", 1745, Sort.FRUIT_TEA);
        this.teas = new ArrayList<>(Arrays.asList(tea1, tea2));
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public void addTea(Tea tea) {
        teas.add(tea);
    }

    public String getName() {
        return name;
    }

    public List<Tea> getTeas() {
        return new ArrayList<>(teas);
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Tea actual : teas) {
            if (actual.getSort() == sort) {
                actual.setPrice(actual.getPrice() * (100 - percent) / 100);
            }
        }
    }

    public double getAveragePrice() {
        double sum = 0;
        for (Tea actual : teas) {
            sum += actual.getPrice();
        }
        return sum / teas.size();
    }
}
