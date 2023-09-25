package exam_sv3_part2.files;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTest {

    @Test
    void testCreateIncome() {
        Income income = new Income(LocalDate.of(2022, 10, 11), 34_000);

        assertEquals(LocalDate.of(2022, 10, 11), income.getDate());
        assertEquals(34_000, income.getMoney());
    }


}