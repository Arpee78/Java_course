package formatlocaleprintf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RunTest {

    Run run;

    @BeforeEach
    void setUp() {
        run = new Run("Árpi");
        run.addRun(10.3);
        run.addRun(7.8);
        run.addRun(15.1);
        run.addRun(3.05);
    }

    @Test
    void addRun() {
        run.addRun(30.1);
        assertEquals(run.getKms().get(4),30.1);
    }

    @Test
    void printFormattedRunText() {
        String result = run.printFormattedRunText();
        String today = LocalDate.now().toString();
        String expected = "Kedves Árpi! A mai dátum: "+today+". Ezen a héten ez a(z) 4. futásod. Most 3,1 km-t futottál. Csak így tovább!";
        assertEquals(result, expected);
    }

}