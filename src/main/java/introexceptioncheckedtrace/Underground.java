package introexceptioncheckedtrace;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Underground {

    public static void main(String[] args) {
        Operations operations = new Operations();

        List<String> numbers = new ArrayList<>();
        try {
            numbers = operations.readFile("src/main/resources/underground.txt");
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        String dailySchedule = operations.getDailySchedule(numbers);
        System.out.println(dailySchedule);


    }
}
