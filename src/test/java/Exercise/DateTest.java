package Exercise;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    Date date;

    @Test
    @DisplayName("Den detta")
    void failToInitilize_exceptionThrown() {


        // How to do this correctly?
        assertThrows(Exception.class, () ->
                new Date(14, 10, 1372)
        );

    }

    @Test
    void testCompareable() throws Exception {

        Date one = new Date(1, 2, 3000);
        Date two = new Date(2, 3, 4000);
        Date three = new Date(2, 3, 4000);

        int compareFirst = one.compareTo(two);
        int compareSecond = two.compareTo(three);

        assertAll(() -> assertEquals(-1000, compareFirst), () -> assertEquals(0, compareSecond));

    }

    @Test
    void equals_testEquality_getCorrectEquality() throws Exception {

        Date one = new Date(1, 2, 3000);
        Date two = new Date(2, 3, 4000);
        Date three = new Date(2, 3, 4000);

        Executable e = () -> assertEquals(false, two.equals(one));
        Executable f = () -> assertEquals(true, three.equals(two));

        assertAll(e, f);

    }

}