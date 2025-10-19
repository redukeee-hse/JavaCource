package calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;

class CalculatorTest {
    static Calculator calculator;

    @BeforeAll
    static void init() {
        calculator = new Calculator();
    }

    @Test 
    void whenAdd2And3Then5() {
        assertEquals(5.0, calculator.add(2, 3));
    }

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2, 3));
        assertEquals(0.0, calculator.add(-2, 2));
        assertEquals(-5.0, calculator.add(-2, -3));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.0, calculator.divide(-6, 3));
        assertEquals(0.0, calculator.divide(0, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3));
        assertEquals(-6.0, calculator.multiply(-2, 3));
        assertEquals(0.0, calculator.multiply(0, 3));
    }

    @Test
    void testSquare() {
        assertEquals(4.0, calculator.square(2));
        assertEquals(9.0, calculator.square(-3));
        assertEquals(100, calculator.square(10), 0.0001);
    }

    @AfterAll
    static void tearDown() {
        calculator = null;
    }

}
