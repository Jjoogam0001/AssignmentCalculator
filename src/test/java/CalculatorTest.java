import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {

    private int value = 3;
    private int value1 = 9;


    @Test
    void addition() {
        int actual = Calculator.addition(value,value1);
        assertEquals(12,actual);



    }

    @Test
    void multiplication() {
        int actual = Calculator.multiplication(value,value1);
        assertEquals(27,actual);
    }

    @Test
    void division() {
        int actual = Calculator.division(value1,value);
        assertEquals(3,actual);
    }

    @Test
    void subtration() {
        int actual = Calculator.subtration(value1,value);
        assertEquals(6,actual);
    }
}