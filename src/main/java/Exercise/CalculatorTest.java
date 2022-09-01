package Exercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @Test
    void getSum_AddTwoValues() {
        Calculator calc = new Calculator();
        int j = 2;
        int i = 3;
        int expected;
        expected = i+j;
        int result = calc.getSum(i, j);
        assertEquals(expected, result);
    }
}