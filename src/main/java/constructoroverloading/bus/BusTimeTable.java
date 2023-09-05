package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public List<SimpleTime> getTimeTable() {
        return new ArrayList<>(timeTable);
    }

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = timeTable;
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = firstHour; i <= lastHour; i++) {
            timeTable.add(new SimpleTime(i, everyMinute));
        }
    }


    public SimpleTime getNextBus(SimpleTime actual) {
        for (SimpleTime s : timeTable) {
            if (s.getDifference(actual)>0){
                return s;
            }
        }
        throw new IllegalStateException("No more buses today!");
    }

}
