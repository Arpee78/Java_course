package exam_sv2_part1_supsup.redlion;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RedLion {

    private String name;
    private List<Cup> teas = new ArrayList<>();
    private LocalTime openTime;
    private LocalTime closeTime;

    public RedLion(String name, LocalTime openTime, LocalTime closeTime) {
        this.name = name;
        teas.add(new Cup("Kamillavirágzat", 1256, Sort.HERBAL_TEA));
        teas.add(new Cup("Cseresznyés álom", 1745, Sort.FRUIT_TEA));
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public List<Cup> getTeas() {
        return teas;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void addCup(Cup cup) {
        teas.add(cup);
    }

    public void setActionPrices(Sort sort, int percent) {
        for (Cup actual : teas) {
            if (actual.getSort() == sort) {
                actual.setPrice(actual.getPrice() * (100 - percent) / 100);
            }
        }
    }

    public double getAveragePrice() {
        double sum = 0;

        for (Cup actual : teas) {
            sum += actual.getPrice();
        }

        return sum / teas.size();
    }


}
