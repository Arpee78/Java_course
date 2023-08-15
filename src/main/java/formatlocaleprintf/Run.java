package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {

    private final String formattedString = "Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d. futásod. Most %.1f km-t futottál. Csak így tovább!";
    private List<Double> kms;
    private String name;

    public Run(String name) {
        this.kms = new ArrayList<>();
        this.name = name;
    }

    public String getFormattedString() {
        return formattedString;
    }

    public List<Double> getKms() {
        return kms;
    }

    public String getName() {
        return name;
    }

    public void addRun(double km) {
        kms.add(km);
    }

    public String printFormattedRunText() {
        String today = LocalDate.now().toString();
        int runCount = kms.size();
        double distance = kms.get(runCount - 1);
        return String.format(formattedString, name, today, runCount, distance);
    }

}
