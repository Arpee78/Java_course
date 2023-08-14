package stringseparate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodesTest {

    @Test
    void getCodesStartWithLetter() {
        Codes codes = new Codes();
        List<String> mixedCodes = Arrays.asList("21dfT", "T57fbj", "xtcu45", "65zhfE4", "f578GVHd", "56Tzu6", "87uzD");
        assertEquals("Betűvel kezdődő kódok: T57fbj, xtcu45, f578GVHd", codes.getCodesStartWithLetter(mixedCodes));
    }
}