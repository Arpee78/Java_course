package exam_sv3_part2.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IncomeManager {

    private List<Income> incomes = new ArrayList<>();

    public List<Income> getIncomes() {
        return new ArrayList<>(incomes);
    }

    public void readIncomesFromFile(Path path) {
        try {
            processLines(Files.readAllLines(path));
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!", e);
        }
    }

    private void processLines(List<String> lines) {
        for (String line : lines) {
            String[] parts = line.split(";");
            LocalDate date = LocalDate.parse(parts[0]);
            int money = Integer.parseInt(parts[1]);
            if (incomes.size() > 0 && date.isBefore(incomes.get(incomes.size() - 1).getDate())) {
                throw new IllegalArgumentException("Income date is not valid: " + date);
            }
            incomes.add(new Income(date, money));
        }
    }
}
